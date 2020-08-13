var app = new Vue({
  el: "#app",
  data: {
    message: "Hello Roadies!",
  },
});

var app2 = new Vue({
  el: "#app-2",
  data: {
    message:
      "You loaded this page on " +
      new Date().toLocaleString() +
      " Have a nice day!",
  },
});

var app3 = new Vue({
  el: "#app-3",
  data: {
    seen: true,
  },
});

var app4 = new Vue({
  el: "#app-4",
  data: {
    todos: [
      { text: "Learn JavaScript" },
      { text: "Learn Vue" },
      { text: "Build something awesome" },
    ],
  },
});

var app5 = new Vue({
    el: '#app-5',
    data: {
      message: 'Hello everybody how are you doing?'
    },
    methods: {
      reverseMessage: function () {
        this.message = this.message.split('').reverse().join('')
      }
    }
  })

  var app6 = new Vue({
    el: '#app-6',
    data: {
      message: 'Hello Vue!'
    }
  })

  // Define a new component called todo-item
  Vue.component('todo-item', {
    props: ['todo'],
    template: '<li>{{ todo.text }}</li>'
  })
  
  var app7 = new Vue({
    el: '#app-7',
    data: {
      groceryList: [
        { id: 0, text: 'Vegetables' },
        { id: 1, text: 'Cheese' },
        { id: 2, text: 'Whatever else humans are supposed to eat' }
      ]
    }
  })
