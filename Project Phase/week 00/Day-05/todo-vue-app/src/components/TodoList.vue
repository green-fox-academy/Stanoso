<template>
  <div>
    {{see}}
    <ul>
      <li v-for="todo in arrOfTodos" :key="todo.title">
        <TodoItem
          v-bind:item="todo"
          v-on:itemToDelete="itemToDel"
          v-on:setDone="setTodoDone"
          v-on:editTD="editTodo"
        />
      </li>
    </ul>
  </div>
</template>

<script>
import TodoItem from "./TodoItem.vue";

export default {
  name: "TodoList",
  props: {
    arrOfTodos: Array,
  },

  components: {
    TodoItem,
  },

  data: function () {
    return { see: null };
  },

  methods: {
    itemToDel: function (value) {
      this.$emit("itemToDelete", value);
    },

    setTodoDone: function (value) {
      this.$emit("setItemDone", value);
     
    },

    editTodo: function (value1, value2) {
      this.$emit("itemToEdit", value1, value2);
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