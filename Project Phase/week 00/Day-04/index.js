var app = new Vue({
    el: '#app',
    data: {
      message: 'Hello Roadies!'
    }
  })

  var app2 = new Vue({
    el: '#app-2',
    data: {
      message: 'You loaded this page on ' + new Date().toLocaleString() + ' Have a nice day!'
    }
  })

  var app3 = new Vue({
    el: '#app-3',
    data: {
      seen: true
    }
  })