//2017 Java C 2
public class InterestGroup {

	public static void main(String[] args) {
		int[] a = {12894792, 92774113, 59529208, 22962224, 2991600, 83340521, 87365045, 
				40818286, 16400628, 39475245, 55933381, 76940287, 61366748, 95631228, 
				17102313, 50682833, 61562613, 87002524, 83062019, 51743442, 61977890, 
				32010762, 69680621, 87179571, 81761697, 32364296, 7833271, 36198035, 
				26588918, 84046668, 43059468, 73191775, 56794101, 454780, 11141030, 
				10008994, 35072237, 44945158, 53959980, 75758119, 18560273, 35801494, 
				42102550, 22496415, 3981786, 34593672, 13074905, 07733442, 42374678, 
				23452507, 98586743, 30771281, 17703080, 52123562, 5898131, 56698981, 
				90758589, 18238802, 18217979, 4511837, 75682969, 31135682, 55379006, 
				42224598, 98263070, 40228312, 28924663, 11580163, 25686441, 45944028, 
				96731602, 53675990, 3854194, 14858183, 16866794, 40677007, 73141512, 
				32317341, 56641725, 43123040, 15201174, 62389950, 72887083, 76860787, 
				61046319, 6923746, 17874548, 46028629, 10577743, 48747364, 5328780, 
				59855415, 60965266, 20592606, 14471207, 70896866, 46938647, 33575820, 
				53426294, 56093931, 51326542, 94050481, 80114017, 33010503, 72971538, 
				22407422, 17305672, 78974338, 93209260, 83461794, 41247821, 26118061, 
				10657376, 42198057, 15338224, 50284714, 32232841, 26716521, 76048344, 
				23676625, 62897700, 69296551, 59653393, 38704390, 48481614, 69782897, 
				26850668, 37471053, 88720989, 51010849, 94951571, 60024611, 29808329, 
				70377786, 13899299, 9683688, 58218284, 46792829, 97221709, 45286643, 
				48158629, 57367208, 26903401, 76900414, 87927040, 9926730, 1508757, 
				15101101, 62491840, 43802529};
		int[] b = {44894050, 34662733, 44141729, 92774113, 99208727, 91919833, 23727681, 
				10003409, 55933381, 54443275, 13584702, 96523685, 50682833, 61562613, 
				62380975, 20311684, 93200452, 23101945, 42192880, 28992561, 18460278, 
				19186537, 58465301, 01111066, 62680429, 23721241, 20277631, 91708977, 
				57514737, 3981786, 81541612, 07346443, 93154608, 19709455, 37446968, 
				17703080, 72378958, 66200696, 30610382, 89586343, 33152171, 67040930, 
				35696683, 63242065, 99948221, 96233367, 52593493, 98263070, 1418023, 
				74816705, 89375940, 58405334, 96731602, 84089545, 16866794, 94737626, 
				01673442, 70548494, 13638168, 8163691, 11106566, 64375392, 40267902, 
				897705, 56447313, 54532235, 94738425, 66642634, 83219544, 40546096, 
				66924991, 20592606, 96037590, 73434467, 70896866, 91025618, 57892091, 
				8487641, 32500082, 84412833, 23311447, 38380409, 79957822, 72971538, 
				69645784, 91863314, 73099909, 93209260, 83461794, 81378487, 30423273, 
				22233715, 32232841, 26716521, 03511221, 29196547, 58263562, 56233305, 
				52547525, 55812835, 87253244, 52484232, 80837360, 94098464, 52028151, 
				53267501, 66381929, 84381316, 59788467, 9683688, 67082008, 71605255, 
				80654064, 21434307, 45286643, 76556656, 82465821, 57367208, 79218980, 
				48460468, 59170479, 46046391, 43043164, 96544490, 83340521, 70837892, 
				18926791, 40818286, 28936302, 11489524, 51031183, 73860337, 13241219, 
				9025448, 10718828, 76360986, 26031606, 76558053, 97726139, 46473415, 
				48406387, 23625539, 86756012, 35164187, 49161302, 78082834, 35072237, 
				8602486, 29815841, 56562216, 77684187, 81751704, 20160464, 50407962, 
				27786415, 19893526, 934129, 37759498, 52636463, 25666982, 43262852, 
				38393436, 2581136, 29323250, 56950657, 5898131, 95286262, 75574581, 
				54057961, 6703896, 90758589, 57782642, 34492535, 41919697, 6395464, 
				10993500, 81212949, 34017532, 69569396, 99009936, 57129610, 67401593, 
				71044018, 62076698, 29533873, 71936325, 86874388, 26545032, 35695544, 
				30433724, 53127345, 72887083, 25390873, 63711546, 6923746, 27783723, 
				33199575, 35929698, 16491251, 18276792, 62744775, 92096155, 06336570, 
				56141974, 73007273, 31416832, 00171057, 64176982, 46938647, 58460388, 
				69972026, 73724304, 27435484, 51568616, 15531822, 47788699, 11818851, 
				41594694, 83561325, 43107163, 56965375, 10557343, 26118061, 74650126, 
				90076467, 10657376, 49901436, 03425162, 61164599, 15797769, 5427896, 
				14444084, 36795868, 18079449, 59653393, 72942548, 06763077, 33895610, 
				94892653, 12085268, 65174140, 79567366, 23020126, 74290047, 13498869, 
				21696323, 27724594, 54941003, 38229841, 7050068};
		int[]c = {13404901, 39952424, 47847739, 94939581, 13809950, 70966043, 11161555, 
				17102313, 47079425, 50682833, 74154313, 61562613, 93200452, 37103342, 
				18479435, 32502597, 36198035, 54210010, 73191775, 48358178, 85544503, 
				5996766, 54651623, 52113220, 27465181, 23871783, 22496415, 54107041, 
				65899605, 56528700, 82671109, 61176034, 42374678, 51612628, 63329997, 
				56591652, 04552733, 12789324, 89586343, 51935014, 38611966, 43916409, 
				70996050, 98263070, 1418023, 65345049, 21734275, 76846198, 71506230, 
				833171, 67128139, 41367555, 64769510, 44010700, 16475199, 93164325, 
				9386162, 95324041, 80688223, 67629139, 79552617, 76219736, 50368644, 
				45096021, 54972488, 63779011, 28862942, 73145521, 74078605, 66924991, 
				12806850, 02171001, 70896866, 73434467, 8487641, 44415025, 32500082, 
				84412833, 83896188, 52243759, 49191410, 38744339, 48079796, 44937032, 
				06267501, 81866886, 38575984, 25978688, 78974338, 41247821, 12356966, 
				64842303, 79127158, 2366944, 68000570, 12426275, 96409230, 705972, 
				8266503, 83820884, 8831807, 43273308, 23216105, 29196547, 95160161, 
				05553537, 52182214, 32641346, 91553427, 24436506, 77433749, 1979664, 
				52028151, 88985343, 1761499, 76203088, 63237368, 23405334, 59788467, 
				9683688, 67755443, 29946533, 12053603, 437479, 15200030, 45286643, 
				93537527, 82465821, 57367208, 53899751, 15354933, 97760830, 68933762, 
				80220545, 1892750, 39868288, 21524323, 69716610, 65083815, 78048499, 
				3227391, 83340521, 87365045, 71720254, 51031183, 89168555, 8503028, 
				37086236, 25103057, 87002524, 22808816, 80928090, 90741678, 15993372, 
				99117082, 49938176, 21755083, 86903426, 87830263, 53959980, 75758119, 
				59781354, 58679691, 25666982, 56307643, 47180521, 62776522, 78136608, 
				44882734, 90758589, 8075999, 66303819, 23480347, 11580163, 87080118, 
				18329165, 92514163, 89404632, 92377859, 3912329, 17499963, 59699979, 
				79876366, 63894807, 37857001, 86003935, 90087123, 29433345, 80298948, 
				61531153, 61046319, 37839841, 19421134, 48747364, 35196916, 62484573, 
				59907079, 36845702, 21631642, 72739317, 26283700, 80114017, 76639390, 
				29154110, 35159758, 47788699, 11818851, 56520669, 36396767, 36031167, 
				83817428, 10657376, 90076467, 14676452, 11024560, 16327605, 76048344, 
				14444084, 95452011, 99612346, 65172562, 84813675, 88618282, 38704390, 
				27998014, 63859011, 33787505, 60024611, 16229880, 13899299, 35240335, 
				29173227, 45036451, 66177893, 82658333, 43100730, 44520187, 74290047, 
				85013538, 9926730, 27724594, 95148523, 20503000, 64390907, 26006953, 
				98116293, 97457666, 29017396, 04634371, 70791589};
		int ab[]=new int[100];
		int index=0;
		for(int i=0; i<a.length; i++){
			for(int k=0; k<b.length; k++){
					if(a[i]==b[k]){
						ab[index]=a[i];
						index++;
					}
			}
		}
		int cont=0;
		for(int i=0; i<index; i++){
			for(int k=0; k<c.length; k++){
				if(ab[i]==c[k]){
					cont++;
					continue;
				}
			}
		}
		System.out.printf("A与B相等:%d\n",index);
		System.out.printf("A与B与C相等:%d\n",cont);
		System.out.printf("结果:%d\n",index-cont);
	}

}
