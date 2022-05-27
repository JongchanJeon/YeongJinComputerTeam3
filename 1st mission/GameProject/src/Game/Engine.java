package Game;

public class Engine {
	static int EventNum = 1;
	static int Life = 3;
	
	// http://mwultong.blogspot.com/2008/04/html-txt-to-html.html
	// 위 링크에서 이벤트 대본 넣고, 헤더 없이 본문만 간단히 변환 하고 앞뒤로 <html></html> 넣어주면 됩니다
	public String eventScript() {
		if (EventNum == 1) {
			return "<html>아직 이 사실이 믿기지 않는다...<br>\r\n"
					+ "영화 주인공이 이런 기분일까?<br>\r\n"
					+ "다행히 좀비들이 영화만큼 적극적이진 않은 것 같다.<br>\r\n"
					+ "강의실 안에서 잘 숨으면 안전할 것 같다.<br>\r\n"
					+ "밖은 아직도 많이 소란스럽고 내가 숨어있는 강의실 문 앞도 소란스럽다<br>\r\n"
					+ "창문 밖은 말 그대로 난장판이다.<br>\r\n"
					+ "가끔 사람 비명 소리가 들리기도 하지만 대부분 나처럼 숨어있거나 이미 도망가거나 아니면... 생각하기 싫다<br>\r\n"
					+ "<br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 2) {
			return "<html>자고 일어나면 집에서 편히 일어났으면 좋겠다고 생각했다.<br>\r\n"
					+ "지금이라도 눈을 뜨면 일상이었으면 좋겠다<br>\r\n"
					+ "이게 꿈이든 현실이든 지금 나는 배가 고프다<br>\r\n"
					+ "어제 싸온 도시락이 있지만 놀라서 먹을 생각을 못 했다.<br>\r\n"
					+ "언제 밖으로 나갈지, 아니면 언제 꿈에서 깰지 모르니 최대한 아껴먹어야겠지...<br>\r\n"
					+ "그나저나 밖에서 수상한 소리가 들린다.<br>\r\n"
					+ "자세히 들으니 살려달라는 말인 것 같다.<br>\r\n"
					+ "<br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 3) {
			return "<html>오늘 어딘가 아주 멀리서 자그마한 방송 소리가 들려왔다.<br>\r\n"
					+ "군에서 구출 작전을 시작했다고 한다.<br>\r\n"
					+ "내가 있는 곳은 11일 뒤 군대가 도착한다.<br>\r\n"
					+ "그동안 먹을 식량은 당연히 없고, 인터넷 문자 통화도 안 되고 이 좁은 곳에 너무 오래 있으니 나도 미쳐버릴 것 같다.<br>\r\n"
					+ "좀비 소리도 뜸해지기 시작했으니 슬슬 밖으로 나가보기로 결심했다.<br>\r\n"
					+ "살려면 뭐든 해야지<br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 4) {
			return "<html>나갈 준비를 하고 나갈까 말까를 고민하던 찰나 갑자기 노크 소리가 들려왔다<br>\r\n"
					+ "누군가가 왔다.<br>\r\n"
					+ "나를 도와줄지, 해칠지, 지능적인 좀비일지도 모르겠다 어쩌지?<br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 5) {
			return "<html>괜히 돌아다녔나. 더 배 고프다.<br>\r\n"
					+ "그동안 갖고 있던 도시락을 최대한 아껴 먹어봤지만 당연히 이미 한계다.<br>\r\n"
					+ "좀비고 뭐고 이젠 밥 생각밖에 안 난다.<br>\r\n"
					+ "배가 너무 고프다. 어떻게든 식량을 구해봐야지<br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 6) {
			return "<html>밖에서 헬리콥터 소리가 들린다.<br>\r\n"
					+ "벌써 군대가 도착할 시간이 아닌데<br>\r\n"
					+ "생각할 시간이 없다<br><br><br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 7) {
			return "<html>이제 밖에 나가는 것도, 좀비를 피해 다니는 것도, 도망 다니는 것도 익숙해졌다<br>\r\n"
					+ "근데 사람을 만나는 건 익숙해지지 않았다.<br>\r\n"
					+ "근데 그게 지금 일어났다. 그것도 다친 사람이랑<br><br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 8) {
			return "<html>나의 단잠을 방해하는 화재경보기.<br>\r\n"
					+ "전기가 끊겨도 화재경보기는 잘 살아있구나<br>\r\n"
					+ "그나저나 화재면 위험한테 빨리 탈출해야 할까?<br>\r\n"
					+ "소리가 나는데 좀비가 몰려들었으면 어쩌지?<br><br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 9) {
			return "<html>오늘도 나갈 준비를 한다.<br>\r\n"
					+ "이젠 나가는 것이 일상이 된 기분이다.<br>\r\n"
					+ "슬슬 식량도 부족해지는데 오늘은... 어? 갑자기 노크 소리가 났다.<br>\r\n"
					+ "저번에 왔던 사람은 온순한 사람 같아 보였지만 이번에도 과연 그럴까?<br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 10) {
			return "<html>배고프다...<br>\r\n"
					+ "배고파서 잠도 안 온다...<br>\r\n"
					+ "하 어제 그 사람만 아니었어도...<br>\r\n"
					+ "일단 굶어죽기 전에 나가봐야 할 것 같다<br><br><br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 11) {
			return "<html>오늘도 학교에서 일어났다.<br>\r\n"
					+ "역시나 길고 끔찍한 악몽은 아니었다.<br>\r\n"
					+ "군대의 구조가 멀지는 않았지만 내 한계도 멀지 않은 것 같다<br>\r\n"
					+ "아니 애초에 그 군대라는 걸 믿을 수는 있을까?<br>\r\n"
					+ "요즘은 너무 지쳐서 아무 생각도 못 했는데 오늘따라 이상한 생각이 많아진다<br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 12) {
			return "<html>매일 좀비를 피하고 숨고 피하고 숨고...<br>아주 짧은 거리를 움직일 때도 아주 많은 시간이 걸린다<br>\r\n"
					+ "그래서 밖으로 나가는 것이 즐겁지는 않다.<br>\r\n"
					+ "그렇다고 지금처럼 누군가 찾아오는 것도 즐겁지는 않다<br><br>\r\n"
					+ "밖에서 사람 소리가 들린다.<br>\r\n"
					+ "날 봤다고 음식을 구걸하러 왔다고 한다<br>\r\n"
					+ "마침 유통기한이 지나서 먹기 애매한 음식이 있긴 한데...<br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 13) {
			return "<html>내일이면 드디어 구조가 오는 날이다.<br>\r\n"
					+ "이 길고 험난한 여정도 이제 끝이 보인다<br>\r\n"
					+ "오늘은 조용히 넘어가려고 했는데 밖이 너무 소란스럽다.<br>\r\n"
					+ "사람들 소리가 시끄럽게 들리는 듯하다<br>\r\n"
					+ "혹시 군이 일정보다 하루 일찍 온 건가?<br>\r\n"
					+ "비명소리가 들리는 것 보니 상황이 좋지는 않아 보이는데...<br><br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 14) {
			return "<html>영원히 끝날 것 같지 않던 이 생활이 드디어 끝이 보인다.<br>\r\n"
					+ "평범한 일상으로 돌아갈 수 있을까 하는 생각에 기대 반 걱정 반이다.<br>\r\n"
					+ "밖에서 들려오는 총성 소리에 서서히 나갈 준비를 했다.<br>\r\n"
					+ "이제 보니 그동안 한 번도 씻지 못해 냄새가 너무 나는 것 같다<br>\r\n"
					+ "<br>\r\n"
					+ "혹시나 게임 속 배드 엔딩처럼 마지막 반전이 있지 않을까 걱정도 잠시 했지만 다행히 그런 일은 없었다.<br>\r\n"
					+ "나는 병원으로 옮겨져 치료를 받고 있고 다행히 중상은 없어 퇴원까지 오래 걸리진 않을 것 같다.<br>\r\n"
					+ "세상은 생각보다 빠르게 원상복구되고 있었고 백신 개발도 빠르게 진행 중인 듯하다.<br><br><br><br></html>";
		}
		else return "";
	}
	
	public String select1Text() {
		if (EventNum == 1) {
			return "<html>문밖을 살짝 본다</html>";
		}
		else if (EventNum == 2) {
			return "<html>문을 살짝 열어본다</html>";
		}
		else if (EventNum == 3) {
			return "<html>주변 강의실을 둘러본다</html>";
		}
		else if (EventNum == 4) {
			return "<html>열어본다</html>";
		}
		else if (EventNum == 5) {
			return "<html>학교 안 매점으로 간다</html>";
		}
		else if (EventNum == 6) {
			return "<html>아직 올 날이 아니니 기다려본다</html>";
		}
		else if (EventNum == 7) {
			return "<html>도와준다</html>";
		}
		else if (EventNum == 8) {
			return "<html>가본다</html>";
		}
		else if (EventNum == 9) {
			return "<html>열어본다</html>";
		}
		else if (EventNum == 10) {
			return "<html>학교 안 매점으로 간다</html>";
		}
		else if (EventNum == 11) {
			return "<html>그냥 쉬면서 시간을 때운다</html>";
		}
		else if (EventNum == 12) {
			return "<html>문을 살짝 열고 음식만 건네준다</html>";
		}
		else if (EventNum == 13) {
			return "<html>나가본다</html>";
		}
		else return "";
	}
	
	public String select2Text() {
		if (EventNum == 1) {
			return "<html>조용히 숨어있는다</html>";
		}
		else if (EventNum == 2) {
			return "<html>없는 척한다</html>";
		}
		else if (EventNum == 3) {
			return "<html>1층으로 나가본다</html>";
		}
		else if (EventNum == 4) {
			return "<html>없는 척한다</html>";
		}
		else if (EventNum == 5) {
			return "<html>학교 바로 옆 편의점으로 간다</html>";
		}
		else if (EventNum == 6) {
			return "<html>빨리 나가본다</html>";
		}
		else if (EventNum == 7) {
			return "<html>무시한다</html>";
		}
		else if (EventNum == 8) {
			return "<html>기다린다</html>";
		}
		else if (EventNum == 9) {
			return "<html>없는 척한다</html>";
		}
		else if (EventNum == 10) {
			return "<html>학교 바로 옆 편의점으로 간다</html>";
		}
		else if (EventNum == 11) {
			return "<html>잠을 청한다</html>";
		}
		else if (EventNum == 12) {
			return "<html>무시한다</html>";
		}
		else if (EventNum == 13) {
			return "<html>그냥 기다린다</html>";
		}
		else return "";
	}
	
	public String select1Script() {
		if (EventNum == 1) {
			return "<html>아직 이 사실이 믿기지 않는다...<br>\r\n"
					+ "영화 주인공이 이런 기분일까?<br>\r\n"
					+ "다행히 좀비들이 영화만큼 적극적이진 않은 것 같다.<br>\r\n"
					+ "강의실 안에서 잘 숨으면 안전할 것 같다.<br>\r\n"
					+ "밖은 아직도 많이 소란스럽고 내가 숨어있는 강의실 문 앞도 소란스럽다<br>\r\n"
					+ "창문 밖은 말 그대로 난장판이다.<br>\r\n"
					+ "가끔 사람 비명 소리가 들리기도 하지만 대부분 나처럼 숨어있거나 이미 도망가거나 아니면... 생각하기 싫다<br>\r\n"
					+ "<br>\r\n"
					+ "심장이 너무 뛴다. 좀비랑 눈이 마주쳤다. 다행히 문을 부수거나 하진 않았다. 미칠 것 같다.<br>\r\n"
					+ "손이 너무 떨려서 더 이상 못쓰겠다.<br><br><br><br></html>";
		}
		else if (EventNum == 2) {
			return "<html>자고 일어나면 집에서 편히 일어났으면 좋겠다고 생각했다.<br>\r\n"
					+ "지금이라도 눈을 뜨면 일상이었으면 좋겠다<br>\r\n"
					+ "이게 꿈이든 현실이든 지금 나는 배가 고프다<br>\r\n"
					+ "어제 싸온 도시락이 있지만 놀라서 먹을 생각을 못 했다.<br>\r\n"
					+ "언제 밖으로 나갈지, 아니면 언제 꿈에서 깰지 모르니 최대한 아껴먹어야겠지...<br>\r\n"
					+ "그나저나 밖에서 수상한 소리가 들린다.<br>\r\n"
					+ "자세히 들으니 살려달라는 말인 것 같다.<br>\r\n"
					+ "<br>\r\n"
					+ "사람은 맞았다. 아직까진...<br>\r\n"
					+ "선명히 남아있는 상처는 분명 단순한 상처를 아닐 거고 눈은 풀려있고 정신을 못 차린다.<br>\r\n"
					+ "그래도 다행히 의식은 있는지 공격하진 않았다<br>\r\n"
					+ "다시 냉정하게 문을 닫은 게 너무 신경 쓰이고 마음 아프지만 나도 살아야지...<br>\r\n"
					+ "어제도 그랬지만 오늘따라 유독 잠이 안 온다</html>";
		}
		else if (EventNum == 3) {
			return "<html>오늘 어딘가 아주 멀리서 자그마한 방송 소리가 들려왔다.<br>\r\n"
					+ "군에서 구출 작전을 시작했다고 한다.<br>\r\n"
					+ "내가 있는 곳은 11일 뒤 군대가 도착한다.<br>\r\n"
					+ "그동안 먹을 식량은 당연히 없고, 인터넷 문자 통화도 안 되고 이 좁은 곳에 너무 오래 있으니 나도 미쳐버릴 것 같다.<br>\r\n"
					+ "좀비 소리도 뜸해지기 시작했으니 슬슬 밖으로 나가보기로 결심했다.<br>\r\n"
					+ "살려면 뭐든 해야지<br>\r\n"
					+ "<br>\r\n"
					+ "적어도 근처 강의실에 살아있는 사람은 없었다.<br>\r\n"
					+ "어제 찾아왔던 사람은 좀비가 되어 돌아다니고 있었다<br>\r\n"
					+ "한 번 좀비와 마주치긴 했지만 간신히 따돌릴 수 있었다.<br>\r\n"
					+ "다리가 아직 후들거리지만...<br><br><br></html>";
		}
		else if (EventNum == 4) {
			return "<html>나갈 준비를 하고 나갈까 말까를 고민하던 찰나 갑자기 노크 소리가 들려왔다<br>\r\n"
					+ "누군가가 왔다.<br>\r\n"
					+ "나를 도와줄지, 해칠지, 지능적인 좀비일지도 모르겠다 어쩌지?<br>\r\n"
					+ "<br>\r\n"
					+ "마음과 몸의 준비를 단단히 하고 문을 열었다.<br>\r\n"
					+ "다행히 상대는 멀쩡한 학생이었고 몇 가지 대화를 나눴다.<br>\r\n"
					+ "어제 돌아다니는 나를 봤고, 오늘 찾아다녔다고 한다.<br>\r\n"
					+ "찾아다닌 이유는 배가 고파서라고 한다.<br>\r\n"
					+ "그건 나도... 음식은 못 나눠줬다.<br>\r\n"
					+ "앞으로 같이 생존해볼까 생각도 했지만 식량 문제로 그냥 말은 꺼내지 않았다.<br>\r\n"
					+ "저 사람도 분명 비슷한 생각 했겠지<br>\r\n"
					+ "오랜만에 만난 사람에 신나서 대화했었지만 이제 생각해 보니 아무 소득도 없었네...<br></html>";
		}
		else if (EventNum == 5) {
			if (Life < 3) Life++;
			return "<html>괜히 돌아다녔나. 더 배 고프다.<br>\r\n"
					+ "그동안 갖고 있던 도시락을 최대한 아껴 먹어봤지만 당연히 이미 한계다.<br>\r\n"
					+ "좀비고 뭐고 이젠 밥 생각밖에 안 난다.<br>\r\n"
					+ "배가 너무 고프다. 어떻게든 식량을 구해봐야지<br>\r\n"
					+ "<br>\r\n"
					+ "먹을게 많아서 다행이야...<br>\r\n"
					+ "이 정도면 앞으로 며칠간은 식량 걱정할 필요가 없을 것 같다.<br>\r\n"
					+ "오랜만에 잘 먹으니 살 거 같다<br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 6) {
			return "<html>밖에서 헬리콥터 소리가 들린다.<br>벌써 군대가 도착할 시간이 아닌데<br>\r\n"
					+ "생각할 시간이 없다<br>\r\n"
					+ "<br>\r\n"
					+ "아 잘못 생각했나. 나갈 걸 그랬나.<br>\r\n"
					+ "나도 모르게 일정이 앞당겨진 건 아니겠지. 또 오겠지<br>\r\n"
					+ "라고 쓰는 순간 밖에서 사람 비명소리가 들렸다.<br>\r\n"
					+ "내가 아니라 다행이야. 세상 일은 모르는 법이지...<br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 7) {
			if (Life < 3) Life++;
			return "<html>이제 밖에 나가는 것도, 좀비를 피해 다니는 것도, 도망 다니는 것도 익숙해졌다<br>\r\n"
					+ "근데 사람을 만나는 건 익숙해지지 않았다.<br>\r\n"
					+ "근데 그게 지금 일어났다. 그것도 다친 사람이랑<br>\r\n"
					+ "<br>\r\n"
					+ "다행히 물린 상처는 보이지 않는 것 같아 도와주기로 했다.<br>\r\n"
					+ "좀비에게서 도망치다가 다쳤다고 한다.<br>\r\n"
					+ "어떻게 안 물렸는지는 모르겠네<br>\r\n"
					+ "다친 사람의 가방엔 충분한 약과 붕대가 있었다.<br>\r\n"
					+ "그 사람 덕분에 내 상처도 치료 할 수 있었다.<br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 8) {
			return "<html>나의 단잠을 방해하는 화재경보기.<br>\r\n"
					+ "전기가 끊겨도 화재경보기는 잘 살아있구나<br>\r\n"
					+ "그나저나 화재면 위험한테 빨리 탈출해야 할까?<br>\r\n"
					+ "소리가 나는데 좀비가 몰려들었으면 어쩌지?<br>\r\n"
					+ "<br>\r\n"
					+ "화재경보기 앞에는 좀비도 없었고, 화재도 없었다<br>\r\n"
					+ "무사히 화재경보기를 끄고, 돌아오는 것까지 성공했다.<br><br><br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 9) {
			Life--;
			return "<html>오늘도 나갈 준비를 한다.<br>\r\n"
					+ "이젠 나가는 것이 일상이 된 기분이다.<br>\r\n"
					+ "슬슬 식량도 부족해지는데 오늘은... 어? 갑자기 노크 소리가 났다.<br>\r\n"
					+ "저번에 왔던 사람은 온순한 사람 같아 보였지만 이번에도 과연 그럴까?<br>\r\n"
					+ "<br>\r\n"
					+ "멀쩡한 사람이었다. 몸만 멀쩡한.<br>\r\n"
					+ "그 사람은 내가 문을 열자마자 다짜고짜 각목을 휘둘렀고 싸움이 펼쳐졌다<br>\r\n"
					+ "다행히 나도 쇠 파이프를 들고 있어서 어찌저찌 쫓아내긴 했다.<br>\r\n"
					+ "물론 다치긴 했지만...<br>\r\n"
					+ "아마 식량을 노리고 온 것 같다.<br>\r\n"
					+ "내가 여기 있는 건 어떻게 알고 온 거지...<br><br></html>";
		}
		else if (EventNum == 10) {
			if (Life < 3) Life++;
			return "<html>배고프다...<br>\r\n"
					+ "배고파서 잠도 안 온다...<br>\r\n"
					+ "하 어제 그 사람만 아니었어도...<br>\r\n"
					+ "일단 굶어죽기 전에 나가봐야 할 것 같다<br>\r\n"
					+ "<br>\r\n"
					+ "먹을거리가 많진 않았지만 다행히 내가 챙겨갈 정도는 남아 있었다.<br>\r\n"
					+ "좀비는 밥도 안 먹나?<br>\r\n"
					+ "나 외에 생존 중인 사람도 있는 것 같다.<br>\r\n"
					+ "매점 여기저기 사람의 흔적 같은 게 보이는 것 같다.<br>\r\n"
					+ "하긴 나한테도 사람이 몇 번 찾아오긴 했었네...<br>\r\n"
					+ "사람이 있다는 것이 좋은 신호인지 아닌지도 모르겠다.<br>\r\n"
					+ "이젠 다 지친다. 포기하고 싶다<br><br><br><br></html>";
		}
		else if (EventNum == 11) {
			return "<html>오늘도 학교에서 일어났다.<br>\r\n"
					+ "역시나 길고 끔찍한 악몽은 아니었다.<br>\r\n"
					+ "군대의 구조가 멀지는 않았지만 내 한계도 멀지 않은 것 같다<br>\r\n"
					+ "아니 애초에 그 군대라는 걸 믿을 수는 있을까?<br>\r\n"
					+ "요즘은 너무 지쳐서 아무 생각도 못 했는데 오늘따라 이상한 생각이 많아진다<br>\r\n"
					+ "<br>\r\n"
					+ "한번 나갈 때마다 좀비를 피하기 위해 몇십 분~몇 시간씩 숨어서 지내는 것도 이젠 힘들지 않다<br>\r\n"
					+ "이젠 한 마리 정도는 겁도 나지 않는다.<br>\r\n"
					+ "뭔가 점점 무감각해지는 느낌이 든다.<br>\r\n"
					+ "세상이 회색빛으로 물든 느낌이다.<br>\r\n"
					+ "자기 전 내가 그동안 쓴 일기를 한 번 읽어봤다.<br>\r\n"
					+ "갈수록 짧아지는 글이 갈수록 지쳐가는 내 몸과 마음을 보여주는 듯하다</html>";
		}
		else if (EventNum == 12) {
			return "<html>매일 좀비를 피하고 숨고 피하고 숨고...<br>\r\n"
					+ "아주 짧은 거리를 움직일 때도 아주 많은 시간이 걸린다<br>\r\n"
					+ "그래서 밖으로 나가는 것이 즐겁지는 않다.<br>\r\n"
					+ "그렇다고 지금처럼 누군가 찾아오는 것도 즐겁지는 않다<br>\r\n"
					+ "밖에서 사람 소리가 들린다.<br>\r\n"
					+ "날 봤다고 음식을 구걸하러 왔다고 한다<br>\r\n"
					+ "마침 유통기한이 지나서 먹기 애매한 음식이 있긴 한데...<br>\r\n"
					+ "<br>\r\n"
					+ "정말 음식만 구하러 온 사람이었다.<br>\r\n"
					+ "울먹거리는 감사 인사와 함께 사람은 사라진 듯하다<br>\r\n"
					+ "혹시나 감사 인사로 무언가 놓고 가진 않을까 기대했지만...<br>\r\n"
					+ "목숨을 걸고 구걸하러 다니는 사람에게 그건 좀 무리였나<br><br><br><br></html>";
		}
		else if (EventNum == 13) {
			return "<html>내일이면 드디어 구조가 오는 날이다.<br>\r\n"
					+ "이 길고 험난한 여정도 이제 끝이 보인다<br>\r\n"
					+ "오늘은 조용히 넘어가려고 했는데 밖이 너무 소란스럽다.<br>\r\n"
					+ "사람들 소리가 시끄럽게 들리는 듯하다<br>\r\n"
					+ "혹시 군이 일정보다 하루 일찍 온 건가?<br>\r\n"
					+ "비명소리가 들리는 것 보니 상황이 좋지는 않아 보이는데...<br>\r\n"
					+ "<br>\r\n"
					+ "의외로 좀비는 없었다. 하지만 사람들이 대치하고 있었다.<br>\r\n"
					+ "조심히 숨어서 지켜보니 마지막 기회를 틈 타 금품을 약탈하는 패거리와 살기 위해 저항하는 사람들인 것 같다.<br>\r\n"
					+ "여기 사람이 이렇게 많았나?<br>\r\n"
					+ "나는 좀비를 피해 다니던 실력으로 조심히 패거리 뒤로 접근해 저항하는 사람들을 도와줬다. 이 정도는 껌이지<br>\r\n"
					+ "소란을 듣고 좀비가 몰려들긴 했지만 패거리를 미끼 삼아 어렵지 않게 도망쳤다<br>\r\n"
					+ "벌받은 거지 뭐</html>";
		}
		else return "";
	}
	
	public String select2Script() {
		if (EventNum == 1) {
			return "<html>아직 이 사실이 믿기지 않는다...<br>\r\n"
					+ "영화 주인공이 이런 기분일까?<br>\r\n"
					+ "다행히 좀비들이 영화만큼 적극적이진 않은 것 같다.<br>\r\n"
					+ "강의실 안에서 잘 숨으면 안전할 것 같다.<br>\r\n"
					+ "밖은 아직도 많이 소란스럽고 내가 숨어있는 강의실 문 앞도 소란스럽다<br>\r\n"
					+ "창문 밖은 말 그대로 난장판이다.<br>\r\n"
					+ "가끔 사람 비명 소리가 들리기도 하지만 대부분 나처럼 숨어있거나 이미 도망가거나 아니면... 생각하기 싫다<br>\r\n"
					+ "괜한 짓을 할까 잠깐 생각했다<br>\r\n"
					+ "그러다가 밖에 돌아다니는 좀비처럼 되면 어쩌려고 그런 생각을 했는지...<br>\r\n"
					+ "<br>\r\n"
					+ "<br>\r\n"
					+ "<br>\r\n"
					+ "<br></html>";
		}
		else if (EventNum == 2) {
			return "<html>자고 일어나면 집에서 편히 일어났으면 좋겠다고 생각했다.<br>\r\n"
					+ "지금이라도 눈을 뜨면 일상이었으면 좋겠다<br>\r\n"
					+ "이게 꿈이든 현실이든 지금 나는 배가 고프다<br>\r\n"
					+ "어제 싸온 도시락이 있지만 놀라서 먹을 생각을 못 했다.<br>\r\n"
					+ "언제 밖으로 나갈지, 아니면 언제 꿈에서 깰지 모르니 최대한 아껴먹어야겠지...<br>\r\n"
					+ "그나저나 밖에서 수상한 소리가 들린다.<br>\r\n"
					+ "자세히 들으니 살려달라는 말인 것 같다.<br><br>\r\n"
					+ "나는 겁쟁이다. 오늘은 슈퍼 겁쟁이다. 아니 이게 정상인가?<br>\r\n"
					+ "이상한 사람의 함정일지도 모르고,<br>\r\n"
					+ "만약 진짜라 해도 나는 살려줄 수 없으니 이게 맞겠지<br>\r\n"
					+ "<s>죄책감이 들지만</s><br><br><br><br></html>";
		}
		else if (EventNum == 3) {
			Life--;
			return "<html>오늘 어딘가 아주 멀리서 자그마한 방송 소리가 들려왔다.<br>\r\n"
					+ "군에서 구출 작전을 시작했다고 한다.<br>\r\n"
					+ "내가 있는 곳은 11일 뒤 군대가 도착한다.<br>\r\n"
					+ "그동안 먹을 식량은 당연히 없고, 인터넷 문자 통화도 안 되고 이 좁은 곳에 너무 오래 있으니 나도 미쳐버릴 것 같다.<br>\r\n"
					+ "좀비 소리도 뜸해지기 시작했으니 슬슬 밖으로 나가보기로 결심했다.<br>\r\n"
					+ "살려면 뭐든 해야지<br>\r\n"
					+ "<br>\r\n"
					+ "괜히 멀리까지 나간 것 같다.<br>\r\n"
					+ "가는 길이 어쩐지 무난하더니 돌아오는 길에 좀비를 만나 도망치다 넘어져 다쳤다.<br>\r\n"
					+ "다행히 물릴 뻔했지만 물리지 않았다. 정말 큰일 날 뻔했다.<br><br><br></html>";
		}
		else if (EventNum == 4) {
			return "<html>나갈 준비를 하고 나갈까 말까를 고민하던 찰나 갑자기 노크 소리가 들려왔다<br>\r\n"
					+ "누군가가 왔다.<br>\r\n"
					+ "나를 도와줄지, 해칠지, 지능적인 좀비일지도 모르겠다 어쩌지?<br>\r\n"
					+ "<br>\r\n"
					+ "'분명 어제 사람을 본 거 같은데 어디 있지...' 하는 소리와 함께 발걸음이 멀어져 갔다<br>\r\n"
					+ "멀쩡한 사람 같아서 불러볼까 싶었지만 영화 보면 꼭 사라지는척하고 숨어있더라. 그냥 참았다<br>\r\n"
					+ "잘한 건지 아닌지는 모르겠지만 저 사람도 잘 살았으면 좋겠다는 생각이 들긴 한다.<br><br><br><br><br></html>";
		}
		else if (EventNum == 5) {
			Life--;
			return "<html>괜히 돌아다녔나. 더 배 고프다.<br>\r\n"
					+ "그동안 갖고 있던 도시락을 최대한 아껴 먹어봤지만 당연히 이미 한계다.<br>\r\n"
					+ "좀비고 뭐고 이젠 밥 생각밖에 안 난다.<br>\r\n"
					+ "배가 너무 고프다. 어떻게든 식량을 구해봐야지<br>\r\n"
					+ "<br>\r\n"
					+ "<br>\r\n"
					+ "예상대로 편의점에 음식은 많았지만 좀비가 있었다...<br>\r\n"
					+ "그것도 나도 모르게<br>\r\n"
					+ "조금만 늦게 눈치챘으면 정말 큰일 날 뻔했다.<br>\r\n"
					+ "나오다가 부딪혀서 다리를 다치긴 했지만 음식을 챙기긴 해서 굶어 죽진 않겠다... 당분간은...<br><br><br><br><br></html>";
		}
		else if (EventNum == 6) {
			Life--;
			return "<html>밖에서 헬리콥터 소리가 들린다.<br>\r\n"
					+ "벌써 군대가 도착할 시간이 아닌데<br>\r\n"
					+ "생각할 시간이 없다<br>\r\n"
					+ "<br>\r\n"
					+ "너무 흥분해서 그냥 지나가는 헬리콥터 소리라고는 생각을 못 했다.<br>\r\n"
					+ "너무 매정하게 지나가는 헬리콥터에 화난 나머지 좀비가 다가오는지도 몰랐다.<br>\r\n"
					+ "약간의 몸싸움을 했지만 다행히 물리거나 상처가 나진 않았다<br>\r\n"
					+ "영화 보면 이런 걸로는 감염 안 되던데...<br><br><br><br><br><br></html>";
		}
		else if (EventNum == 7) {
			return "<html>이제 밖에 나가는 것도, 좀비를 피해 다니는 것도, 도망 다니는 것도 익숙해졌다<br>\r\n"
					+ "근데 사람을 만나는 건 익숙해지지 않았다.<br>\r\n"
					+ "근데 그게 지금 일어났다. 그것도 다친 사람이랑<br>\r\n"
					+ "<br>\r\n"
					+ "이제 이것도 익숙해지는 것 같다.<br>\r\n"
					+ "점점 죄책감이 줄어들고 있다.<br>\r\n"
					+ "이게 맞는 걸까...<br>\r\n"
					+ "이젠 별로 생각하고 싶지 않다<br><br><br><br><br><br><br><br></html>";
		}
		else if (EventNum == 8) {
			Life--;
			return "<html>나의 단잠을 방해하는 화재경보기.<br>\r\n"
					+ "전기가 끊겨도 화재경보기는 잘 살아있구나<br>\r\n"
					+ "그나저나 화재면 위험한테 빨리 탈출해야 할까?<br>\r\n"
					+ "소리가 나는데 좀비가 몰려들었으면 어쩌지?<br>\r\n"
					+ "<br>\r\n"
					+ "몇 시간째 소리가 멈추지 않는다.<br>\r\n"
					+ "이대로는 잠도 잘 수 없고 소리 때문에 좀비가 몰려들지도 모른다는 생각에 나가보기로 결심했다.<br>\r\n"
					+ "시간이 많이 지난 탓인지 좀비가 약간 몰려있었고, 나는 필사적으로 도망쳤다<br>\r\n"
					+ "목숨은 건졌지만 도망치던 와중에 다치고 말았다.<br>\r\n"
					+ "목숨 값에 비하면 싸게 넘긴 셈 쳐야지<br><br><br><br><br></html>";
		}
		else if (EventNum == 9) {
			return "<html>오늘도 나갈 준비를 한다.<br>\r\n"
					+ "이젠 나가는 것이 일상이 된 기분이다.<br>\r\n"
					+ "슬슬 식량도 부족해지는데 오늘은... 어? 갑자기 노크 소리가 났다.<br>\r\n"
					+ "저번에 왔던 사람은 온순한 사람 같아 보였지만 이번에도 과연 그럴까?<br>\r\n"
					+ "<br>\r\n"
					+ "숨어 있었더니 곧 조용해졌다.<br>\r\n"
					+ "오늘은 왠지 느낌이 불길해 밖으로 나가지 않기로 결심했다.<br>\r\n"
					+ "하지만 배가 너무 고파서 내일은 꼭 나가야 할 것 같다.<br>\r\n"
					+ "아 그냥 오늘 나갈 걸 그랬나<br><br><br><br><br><br></html>";
		}
		else if (EventNum == 10) {
			if (Life < 3) Life++;
			return "<html>배고프다...<br>\r\n"
					+ "배고파서 잠도 안 온다...<br>\r\n"
					+ "하 어제 그 사람만 아니었어도...<br>\r\n"
					+ "일단 굶어죽기 전에 나가봐야 할 것 같다<br>\r\n"
					+ "<br>\r\n"
					+ "학교 밖 편의점은 좀비가 많은 탓인지, 사람이 없는 건지 음식이 꽤 남아 있었다.<br>\r\n"
					+ "오늘 아침까지만 해도 거처를 옮길까 고민도 했지만 막상 밖으로 나와보니 그런 생각은 접는 게 좋을 것 같다.<br>\r\n"
					+ "언제까지 이곳에 갇혀있어야 할까.<br>\r\n"
					+ "이젠 다 지친다. 포기하고 싶다.<br><br><br><br><br><br></html>";
		}
		else if (EventNum == 11) {
			return "<html>오늘도 학교에서 일어났다.<br>\r\n"
					+ "역시나 길고 끔찍한 악몽은 아니었다.<br>\r\n"
					+ "군대의 구조가 멀지는 않았지만 내 한계도 멀지 않은 것 같다<br>\r\n"
					+ "아니 애초에 그 군대라는 걸 믿을 수는 있을까?<br>\r\n"
					+ "요즘은 너무 지쳐서 아무 생각도 못 했는데 오늘따라 이상한 생각이 많아진다<br>\r\n"
					+ "<br>\r\n"
					+ "한번 나갈 때마다 좀비를 피하기 위해 몇십 분~몇 시간씩 숨어서 지내는 것도 이젠 힘들지 않다<br>\r\n"
					+ "이젠 한 마리 정도는 겁도 나지 않는다.<br>\r\n"
					+ "뭔가 점점 무감각해지는 느낌이 든다.<br>\r\n"
					+ "세상이 회색빛으로 물든 느낌이다.<br>\r\n"
					+ "자기 전 내가 그동안 쓴 일기를 한 번 읽어봤다.<br>\r\n"
					+ "갈수록 짧아지는 글이 갈수록 지쳐가는 내 몸과 마음을 보여주는 듯하다</html>";
		}
		else if (EventNum == 12) {
			return "<html>매일 좀비를 피하고 숨고 피하고 숨고...<br>\r\n"
					+ "아주 짧은 거리를 움직일 때도 아주 많은 시간이 걸린다<br>\r\n"
					+ "그래서 밖으로 나가는 것이 즐겁지는 않다.<br>\r\n"
					+ "그렇다고 지금처럼 누군가 찾아오는 것도 즐겁지는 않다<br><br>\r\n"
					+ "밖에서 사람 소리가 들린다.<br>\r\n"
					+ "날 봤다고 음식을 구걸하러 왔다고 한다<br>\r\n"
					+ "마침 유통기한이 지나서 먹기 애매한 음식이 있긴 한데...<br>\r\n"
					+ "<br>\r\n"
					+ "탈출까지 식량이 넉넉하지 않아서 이렇게 낭비할 수는 없다.<br>\r\n"
					+ "나도 목숨 걸고 구한 식량인데 어쩔 수 없지<br><br><br><br><br><br></html>";
		}
		else if (EventNum == 13) {
			Life--;
			return "<html>내일이면 드디어 구조가 오는 날이다.<br>\r\n"
					+ "이 길고 험난한 여정도 이제 끝이 보인다<br>\r\n"
					+ "오늘은 조용히 넘어가려고 했는데 밖이 너무 소란스럽다.<br>\r\n"
					+ "사람들 소리가 시끄럽게 들리는 듯하다<br>\r\n"
					+ "혹시 군이 일정보다 하루 일찍 온 건가?<br>\r\n"
					+ "비명소리가 들리는 것 보니 상황이 좋지는 않아 보이는데...<br>\r\n"
					+ "<br>\r\n"
					+ "소란은 오래가지 않았다.<br>\r\n"
					+ "바깥에서 들리던 소리는 패거리가 마지막 기회를 틈 타 금품을 약탈하러 다니는 소리였고, 다음은 내 차례였다<br>\r\n"
					+ "문을 잠그고 숨어있었지만 패거리는 능숙하게 문을 부수고 들어왔고 나는 속수무책으로 당했다<br>\r\n"
					+ "곧 마지막인데 이런 꼴을 당하다니...<br><br><br><br></html>";
		}
		else return "";
	}
}
