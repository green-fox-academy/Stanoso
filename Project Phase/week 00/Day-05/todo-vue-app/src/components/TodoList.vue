<template>
  <div>
    {{see}}
    <ul>
      <li v-for="todo in arrOfTodos" :key="todo.title">
        <TodoItem
          v-bind:item="todo"
          v-on:itemToDelete="itemTo"
          v-on:setDone="setTodoDone"
          v-on:editTD="editTodo"
        />
      </li>
    </ul>
    <CreateTodo v-on:todonew="addTodo" />
  </div>
</template>

<script>
import TodoItem from "./TodoItem.vue";
import CreateTodo from "./CreateTodo.vue";

export default {
  name: "TodoList",
  props: {
    arrOfTodos: Array,
  },

  components: {
    TodoItem,
    CreateTodo,
  },

  data: function () {
    return { see: null };
  },

  methods: {
    itemTo: function (value) {
      this.arrOfTodos.splice(this.arrOfTodos.indexOf(value), 1);
    },

    addTodo: function (value) {
      this.arrOfTodos.push(value);
    },

    setTodoDone: function (value) {
      const todoSetDone = this.arrOfTodos.indexOf(value);
      this.arrOfTodos[todoSetDone].done = true;
       this.see = value; 
    },

    editTodo: function (value1, value2) {
        const todoEdit = this.arrOfTodos.indexOf(value1);
      this.arrOfTodos[todoEdit] = value2;
      this.see = this.arrOfTodos[todoEdit];  
    },
  },
};
</script>

<style>
ul {
  list-style-type: none;
  padding: 0;
}
</style>