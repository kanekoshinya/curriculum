let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(num) {
    console.log(num + 'は偶数です');
}

for(a=0;a<numbers.length;a++){
  if(numbers[a]%2==0){
      isEven(numbers[a]);
  }
}


class car{
  constructor(gass,number){
    this.gass=gass;
    this.number=number;
  }
  getNumGas(){
    console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です`);
  }
}

let car1 = new car(1,2);
car1.getNumGas();