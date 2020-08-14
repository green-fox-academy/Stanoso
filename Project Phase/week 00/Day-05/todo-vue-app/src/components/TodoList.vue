<template>
  <div>
      
    <ul>
      <li v-for="todo in arrOfTodos" :key="todo.title">
          <TodoItem v-bind:item="todo" />
       </li>
    </ul>
  </div>
</template>

<script>
import TodoItem from './TodoItem.vue';

export default {
  name: "TodoList",
  props: ["arrOfTodos"],
  components: {
    TodoItem
}
};
</script>

<style>
ul {
  list-style-type: none;
  padding: 0;
}
</style>