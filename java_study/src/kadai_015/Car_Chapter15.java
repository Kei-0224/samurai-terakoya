
	package kadai_015;

	public class Car_Chapter15 {

	    // クラスフィールドとしてgearとspeedを宣言
	    private int gear = 1;    // 1速から5速のギアを表す
	    private int speed = 10;  // ギアチェンジ後の速度を表す

	    public static void main(String[] args) {
	        // Car_Chapter15オブジェクトを作成してギアを変更し、走行させる例
	        Car_Chapter15 car = new Car_Chapter15();
	        car.gearChange(3);  // ギアを3に変更
	        car.run();  // 走行の状態を出力
	    }

	    // ギアチェンジメソッド
	    public void gearChange(int afterGear) {
	        this.gear = afterGear;

	        switch (afterGear) {
	            case 1:
	                this.speed = 10;
	                break;
	            case 2:
	                this.speed = 20;
	                break;
	            case 3:
	                this.speed = 30;
	                break;
	            case 4:
	                this.speed = 40;
	                break;
	            case 5:
	                this.speed = 50;
	                break;
	            default:
	                this.speed = 10; // 無効なギアの場合
	        }
	    }

	    // 走行メソッド
	    public void run() {
	        System.out.println("ギアを1から" + this.gear + "に切り替えました");
	        System.out.println("速度は時速" + this.speed + "kmです");
	    }
	}