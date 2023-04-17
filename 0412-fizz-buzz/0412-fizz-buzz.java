class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
            .boxed()
            .map(i -> {
                String str = "";
                if (i % 3 == 0) str += "Fizz";
                if (i % 5 == 0) str += "Buzz";
                if ("".equals(str)) str = String.valueOf(i);
                return str;
            })
            .collect(Collectors.toList());
    }
}