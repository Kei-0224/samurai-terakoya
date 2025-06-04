// Dateオブジェクトを作成
const currentDate = new Date("2024-10-12");

const year = currentDate.getFullYear();

// 月を取得（0から始まるので+1する）
const month = currentDate.getMonth() + 1;

// 日を取得
const day = currentDate.getDate();

// 結果を文字列として表示
console.log(` ${year}年${month}月${day}日`);