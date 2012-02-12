describe ('Taschenrechner',function(){

  it('can type a number', function () {
    expect(Check(1)).toEqual(true);
  });

  it('can`t type a character', function () {
    expect(Check('a')).toEqual(false);
  });
  
});
