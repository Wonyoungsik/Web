

function check(){
	if(document.loginInfo.id.value==""){
		document.loginInfo.id.focus();
		return false;
	}else if(document.loginInfo.pwd.value==""){
		alert("비밀번호를 입력하세요.");
		document.loginInfo.pwd.focus();
		return false;
	}
	else
	  return true;
	
}