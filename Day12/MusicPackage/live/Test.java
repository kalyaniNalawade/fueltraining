import music.Playable;
import music.Stringg.Veena;
import music.wind.Saxaphone;

public class Test{

	public static void main(String[] args) {

		Veena v = new Veena();
		v.play();
		
		Playable p = new Veena();
		p.play();
		
		Saxaphone s = new Saxaphone();
		s.play();
		
		Playable ps = new Saxaphone();
		ps.play();

	}

}
