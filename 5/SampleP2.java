import java.io.*;

class SampleP2{
		public static void main(String[] args) throws IOException{
				System.out.println("成績を入力してください。");

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();
				int num = Integer.parseInt(str);

				switch(num){
					case 1:
						System.out.println("もっとがんばりましょう。");
						break;
					case 2:
						System.out.println("もう少しがんばりましょう。");
						break;
					case 3:
						System.out.println("さらに上をめざしましょう。");
						break;
					case 4:
						System.out.println("たいへんよくできました。");
						break;
					case 5:
						System.out.println("たいへん優秀です。");
						break;
					default:
						System.out.println("1から5までの成績を入力してください。");
						break;
				}
		}
}

						
