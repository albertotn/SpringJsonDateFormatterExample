# The problem

In a model/dto with a date defined as Timestamp, it's required to display using a REST get service in Spring with a particular format.

# The solution

Use the annotation "@JsonFormat" to specify the right format of your date.

# The result

Compile/run the code and call from your browser http://localhost:8080/test, that results:

{
  "id": 1,
  "timestamp": "2022-03-20T21:13:14.061+00:00",
  "isoTimestamp": "2022-03-20T21:13:14Z"
}

note:

- timestamp is the original vaule
- isoTimestamp is the formatted value using a format
- it's not required to add a new field to store the formatted value, it's just to hightlight the difference