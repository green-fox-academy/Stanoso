// var app = new Vue({
//   el: "#app",
//   data: {
//     message: "Hello Roadies!",
//   },
// });

// var app2 = new Vue({
//   el: "#app-2",
//   data: {
//     message:
//       "You loaded this page on " +
//       new Date().toLocaleString() +
//       " Have a nice day!",
//   },
// });

// kadeřnictví Kundlová Andrea 607916010

// var app3 = new Vue({
//   el: "#app-3",
//   data: {
//     seen: true,
//   },
// });

// var app4 = new Vue({
//   el: "#app-4",
//   data: {
//     todos: [
//       { text: "Learn JavaScript" },
//       { text: "Learn Vue" },
//       { text: "Build something awesome" },
//     ],
//   },
// });

// var app5 = new Vue({
//     el: '#app-5',
//     data: {
//       message: 'Hello everybody how are you doing?'
//     },
//     methods: {
//       reverseMessage: function () {
//         this.message = this.message.split('').reverse().join('')
//       }
//     }
//   })

//   var app6 = new Vue({
//     el: '#app-6',
//     data: {
//       message: 'Hello Vue!'
//     }
//   })

//   // Define a new component called todo-item
//   Vue.component('todo-item', {
//     props: ['todo'],
//     template: '<li>{{ todo.text }}</li>'
//   })

//   var app7 = new Vue({
//     el: '#app-7',
//     data: {
//       groceryList: [
//         { id: 0, text: 'Vegetables' },
//         { id: 1, text: 'Cheese' },
//         { id: 2, text: 'Whatever else humans are supposed to eat' }
//       ]
//     }
//   })

var apps1 = new Vue({
  el: "#app-s1",
  data: {
    message: "First try",
  },
});

var apps2 = new Vue({
  el: "#app-s2",
  data: {
    basictext: "Are you hovering over this text?",
    message: "Yes, I am hovering over the text",
  },
});

var apps3 = new Vue({
  el: "#app-s3",
  data: {
    visible: false,
  },
});

var apps4 = new Vue({
  el: "#app-s4",
  data: {
    todos: [
      { text: "Learn using correct brackets" },
      { text: "Learn using correct tags" },
      { text: "Learn using commas where needed" },
    ],
  },
});

var apps5 = new Vue({
  el: "#app-s5",
  data: {
    message: "Hello how are you?",
  },
  methods: {
    reverseMessage: function () {
      this.message = this.message.split("").reverse().join("");
    },
  },
});

var apps6 = new Vue({
  el: "#app-s6",
  data: {
    message: "Good old west",
  },
});

Vue.component("todo-item", {
  props: ["todo"],
  template: '<li> {{todo.id + " (ID) " + todo.text}} </li>',
});

var apps7 = new Vue({
  el: "#app-s7",
  data: {
    shoppingList: [
      { id: 0, text: "Appricots" },
      { id: 1, text: "Peaches" },
      { id: 2, text: "Pears" },
      { id: 3, text: "Chilli peppers" },
      { id: 4, text: "Cucumbers" },
    ],
  },
});

var mess = {
    message: 'Follow the command on the button',
    dont: 'You dont follow rules! The world will explode in 10 minutes! Go and kiss your wife the last time.',
}

// Object.freeze(mess);

var apps8 = new Vue({
  el: "#app-s8",
  data: mess,
});
