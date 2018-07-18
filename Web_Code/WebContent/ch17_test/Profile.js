

/*
 * function 함수 이름 () {}
 * 
 * document는 자바 스크립트를 부른 문서. (모든 태그)
 * 태그의 이름 frm 태그를 찾아라
 * frm 태그 중에서 id라는 태그를 찾아라.
 * value: 그 태그에 있는 값을 가져와라.
 * alert("아이디를 쓰씨오!") / 경고문
 * 
 * document.frm.id.focus();
 * 확인을 누르면 이 문서의 frm의 id focus(커서)를 맞추는 함수.
 * iNsN(document.frim.age.value)
 * 숫자체크 함수 isNaN(값) -> Not a Number
 * 숫자가 아니면 true 반환
 */
function check(){
	if(document.frm.id.value==""){
		alert("아이디를 쓰시오!");
		document.frm.id.focus();
		return false;
	}
	else if(document.frm.age.value==""){
		alert("나이를 쓰시오!");
		document.frm.age.focus();
		return false;
	}
	else if(isNaN(document.frm.age.value)){
		alert("나이에 숫자를 쓰시오!");
		document.frm.age.focus();
		return false;
	}
	else
		return true;
	
}