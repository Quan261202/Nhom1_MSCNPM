// const ctx = document.getElementById('myChart');

//   new Chart(ctx, {
//     type: 'doughnut',
//     data: {
//       labels: ['shit', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
//       datasets: [{
//         label: '# of Votes',
//         data: [12, 19, 3, 5, 2, 3],
//         borderWidth: 1
//       }]
//     },
//     options: {
//       responsive: false,
//       layout: {
//         margin: 100,
//       },
//       scales: {
//         y: {
//           beginAtZero: true,
//           grid: {
//             display: false
//           }
//         },
//       }
//     }
//   });
fetch('/data/chart-data')
    .then(response => response.json())
    .then(data => {
        // Xử lý dữ liệu nhận được từ API
        const labels = data.map(item => item.labelField);
        const values = data.map(item => item.valueField);

        // Gọi hàm để vẽ biểu đồ Chart.js
        drawChart(labels, values);
    })
    .catch(error => console.error('Error fetching data:', error));
    
function drawChart(labels, values) {
    const ctx = document.getElementById('myChart').getContext('2d');
    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [{
                label: 'Data from SQL Server',
                data: values,
                backgroundColor: 'rgba(54, 162, 235, 0.2)',
                borderColor: 'rgba(54, 162, 235, 1)',
                borderWidth: 1
            }]
        },
        options: {
            // Các tùy chọn của biểu đồ (nếu có)
        }
    });
}