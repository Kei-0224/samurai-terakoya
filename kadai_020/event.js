// ① 画面（DOM）から要素を一度だけ取得して定数に入れる
const btn  = document.getElementById("btn");  
const text = document.getElementById("text");  

// ② 取得した定数を使ってイベントを登録
btn.addEventListener("click", () => {
  text.textContent = "ボタンをクリックしました";
});