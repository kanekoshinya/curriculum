var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        searchWord: ''
    },
    //watchでlistの変更を監視
    watch: {
        list: {
            handler: function() {
                //localStorageにデータを保存
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },
    //マウントされた時にlocalStorageからデータを取得
    mounted: function() {
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    methods: {
        addToDo: function() {
            if (this.addText !== '') {
                this.list.push({
                    text: this.addText, 
                    isChecked: false,
                });
            }
            this.addText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        },
        searchItem(list, searchWord) {
            return list.filter(function(item) {
                   console.log("こんにちわ"+list);
              return item.text.indexOf(searchWord) !== -1 || searchWord === "";
            });
        }
    },
    computed: {
		remaining: function() {
			var count = 0;
			var todos = this.list;
            console.log(todos)
			for(var i = 0; i < todos.length; i++) {
				if(!todos[i].isChecked) {
					count++;
				}
			}
			return count;
		},
        filteredItems() {
            return this.searchItem(this.list, this.searchWord);
        }
	}
});