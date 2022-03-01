while True:
    try:
        print()
        print('1: ValueError例外を発生')
        print('2: IndexError例外を発生')
        print('3: 例外を発生させない')
        print('4: 終了')
        number = int(input('選択してください。: '))
        # 問①：if文を用いて、以下の画像のように処理されるように記述しましょう。
        if number == 1:
          i = int('ValueError')
        elif number == 2:
          i = 'str'[5] 
        elif number == 3:
          print('↓')
          print('例外を発生させませんでした')
          print('↓')
          print('もう一度選択しましょう')
        elif number == 4:
          print('↓')
          print('終了します')
          break
        else:
          print(miteigi)
    # 問②：else節を用いて、以下の画像のように処理されるように記述しましょう。
    ##ここに書く
    except ValueError as e:
        print('↓')
        print('Value Error')
        print(e.args)
        print('↓')
        print('もう一度選択しましょう')
    except IndexError as e:
        print('↓')
        print('Index Error')
        print(e.args)
        print('↓')
        print('もう一度選択しましょう')
    except Exception as e:
        print('Exception')
        print(e.args)
print('↓')
print('無限ループを終了します')