function JcreateJuice(fruits){
  console.log(`${fruits}を受け取りました。ジュースにして返します`);
  let juice = fruits + "ジュース";
  return juice;
}

console.log(JcreateJuice("みかん"));
