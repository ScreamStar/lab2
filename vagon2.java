public class vagon2 extends vagon {
	private int KolMest[];
		public void PustojVagon(int NomerVagona){
			NomerEtogoVagona=NomerVagona;
			KolMest= new int[ChisloMest];
			for(int i=0;i<ChisloMest;i++){
				KolMest[i]=0;
				//создаем пустой вагон
			}
		}
		public void IzmenitxChisloMest(int NovoeChisloMest){
			super.ChisloMest=NovoeChisloMest;
			//изменяем число мест
		}
		public void ZanyatxMesto(int NomerMesta){
			if(KolMest[NomerMesta-1]==1){
				System.out.println("Место № " + NomerMesta + ", в вагоне № " + NomerEtogoVagona + " уже занято!");
				//проверяем занято ли место
			}
			KolMest[NomerMesta-1]=1;
		}
		public void VagonInfo(){
			System.out.println("Вагон № "+ NomerEtogoVagona);
			int SvobodnieMesta=0;
			for(int i=0;i<ChisloMest;i++){
				if(KolMest[i]!=1){
					SvobodnieMesta++;
					//считает количество свободных мест
				}
			}
			System.out.println("Число свобдных мест=" + SvobodnieMesta);
			System.out.println("Информация о свободных местах: ");
			for(int i=0;i<ChisloMest;i++){
				if(KolMest[i]==0){
					System.out.print((i+1)+" ");
					//выводим номера свободных мест
				}
			}
			System.out.println("");
			System.out.println("Верхние места: ");
			for(int k=0;k<ChisloMest;k++){
				if((k+1)%2==0 & KolMest[k]==0)
					System.out.print((k+1)+" ");
			}
			System.out.println("");
			System.out.println("Нижние места места: ");
			for(int q=0;q<ChisloMest;q++){
				if((q+1)%2!=0 & KolMest[q]==0)
					System.out.print((q+1)+" ");
			}
			System.out.println("");
		}
}