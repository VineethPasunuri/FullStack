function validateForm() {
    var form = document.simpleForm;
    var name = form.un;
    var password = form.pw;
    if (name.value.length < 1) {
        alert("User Name Can't be Empty");
        return false
    }
    if (password.value.length < 1) {
        alert("Password can't be empty");
        return false
    }
}