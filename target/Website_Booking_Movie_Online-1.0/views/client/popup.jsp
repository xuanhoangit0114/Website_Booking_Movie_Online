<html>
<head>
<title>Ví dụ Form đăng ký JavaScript</title>
</head>
<body>
<form name="form1" method="post" action=""
onsubmit="return validateform()">
Name: <input type="text" name="name"><br>
Password: <input type="password" name="password"><br>
<input type="submit" value="register">
</form>
<script>
function validateform() {
var name = document.form1.name.value;
var password = document.form1.password.value;
if (name == null || name == "") {
alert("Tên đăng nhập không được để trống!");
return false;
} else if (password.length < 6) {
alert("Mật khẩu ít nhất 6 ký tự");
return false;
}
}
</script>
</body>
</html>