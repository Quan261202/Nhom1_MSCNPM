function openForm() {
    document.getElementById("addForm").style.display = "block";
  }
  function closeForm() {
    document.getElementById("addForm").style.display = "none";
  }
  function addDV()
{
  var inputValue = document.getElementById("nameDV").value;
  var newcard = document.createElement("button");
  newcard.className = "newdv";
  newcard.innerHTML = inputValue; 
  var cardcontainer = document.getElementById("newdv1");
  cardcontainer.appendChild(newcard);
}
$.ajax({
  type: 'POST',
  url: 'quanly',
  contentType: 'application/json', // Đảm bảo rằng đây là 'application/json'
  data: JSON.stringify(data),
  success: function (response) {
      console.log(response);
      // Xử lý kết quả thành công
  },
  error: function (error) {
      console.error(error);
      // Xử lý lỗi
  }
});
