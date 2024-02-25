package streamdemo;

import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectOfDemo {
    public static void main(String[] args) {
        System.out.println("Name joiner 1");
        Stream<String> nameStream = generateNameStream();
        Supplier<StringJoiner> joiner = () -> new StringJoiner(" <|> ");
        BiConsumer<StringJoiner, String> accumulator = (j, s) -> j.add(s.toUpperCase());
        BinaryOperator<StringJoiner> combiner = StringJoiner::merge;
        Function<StringJoiner, String> finisher = StringJoiner::toString;
        Collector<String, StringJoiner, String> nameCollector = Collector.of(joiner, // supplier
                accumulator, // accumulator
                combiner, // combiner
                finisher); // finisher

        String names = nameStream.parallel().collect(nameCollector);
        System.out.println(names);
    }

    public static Stream<String> generateNameStream() {
        return Stream.of("Alican", "Veli", "Nil", "Selim", "Nuri", "Zeynep");
    }
}
