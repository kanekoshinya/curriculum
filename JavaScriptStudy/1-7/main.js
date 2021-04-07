class taiyaki{
  constructor(contents1,contents2,contents3){
    this.contents1=contents1;
    this.contents2=contents2;
    this.contents3=contents3;
  }
  contents(){
    console.log(`中身は${this.contents1}です`);
    console.log(`中身は${this.contents2}です`);
    console.log(`中身は${this.contents3}です`);
  }
}

let daifuku = new taiyaki("あんこ","クリーム","チーズ");
daifuku.contents();