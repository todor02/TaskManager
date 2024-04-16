<table>
  <tr>
    <th colspan="5" style="text-align:center;">Task</th>
  </tr>
  <tr>
    <th>Endpoint</th>
    <th>Operation</th>
    <th>Input Params</th>
    <th>Output Params</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>/api/tasks</td>
    <td>POST</td>
    <td>Adding task (JSON)</td>
    <td>Task (JSON)</td>
    <td>Adds new task</td>
  </tr>
  <tr>
    <td>/api/tasks</td>
    <td>GET</td>
    <td>Task (JSON)</td>
    <td>List&lt;Task&gt; (JSON)</td>
    <td>Gets all tasks</td>
  </tr>
  <tr>
    <td>/api/tasks/{id}</td>
    <td>GET</td>
    <td>ID (JSON)</td>
    <td>Task (JSON)</td>
    <td>Searching a task by ID</td>
  </tr>
  <tr>
    <td>/api/tasks/{id}</td>
    <td>PUT</td>
    <td>ID (JSON)</td>
    <td>Task (JSON)</td>
    <td>Updating a task by ID</td>
  </tr>
  <tr>
    <td>/api/tasks/{id}</td>
    <td>DELETE</td>
    <td>ID (JSON)</td>
    <td>NONE</td>
    <td>Deleting a task by ID</td>
  </tr>
</table>