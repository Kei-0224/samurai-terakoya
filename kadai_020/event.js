
 // ① 画面（DOM）から要素を一度だけ取得して定数に入れる
    const btn  = document.getElementById("btn");  
    const text = document.getElementById("text");

    // ② ボタンがクリックされたら処理を実行
    btn.addEventListener("click", () => {
      // ③ 2秒（2000ミリ秒）の待ち時間を設定し、非同期処理を実行する
      setTimeout(() => {
        text.textContent = "ボタンをクリックしました";
      }, 2000);
         });