package ua.com.alevel.nix.baseoperations.service;

import org.springframework.stereotype.Service;

import ua.com.alevel.nix.baseoperations.data.CircleVersusMath;
import ua.com.alevel.nix.baseoperations.data.RangeData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class CircleServiceImpl implements CircleService {

    @Override
    public CircleVersusMath runSum(RangeData data) {

        CircleVersusMath circleVersusMath = new CircleVersusMath();
        long sum = 0;
        long i = 0;

        // for
        long start = System.currentTimeMillis();
        for (i = data.getFrom(); i <= data.getTo() ; i++) {
            sum += i;
        }
        circleVersusMath.setForTime(System.currentTimeMillis() - start);
        circleVersusMath.setForSum(Long.toString(sum));

        // while
        i = data.getFrom();
        sum = 0;
        start = System.currentTimeMillis();
        while (i <= data.getTo()) {
            sum += i;
            ++i;
        }
        circleVersusMath.setWhileSum(Long.toString(sum));
        circleVersusMath.setWhileTime(System.currentTimeMillis() - start);

        // math
        start = System.currentTimeMillis();
        sum = (data.getTo() * (data.getTo() + 1)) / 2;
        circleVersusMath.setMathTime(System.currentTimeMillis() - start);
        circleVersusMath.setMathSum(Long.toString(sum));

//        List<Long> range = LongStream.range(data.getFrom(), data.getTo() + 1).boxed().collect(Collectors.toList());
//
//        //forEach
//        sum = 0;
//        start = System.currentTimeMillis();
//        for (Long current : range) {
//            sum += current;
//        }
//        circleVersusMath.setForEachTime(System.currentTimeMillis() - start);
//        circleVersusMath.setForEachSum(Long.toString(sum));
//
//        //forEachStream
//        i = data.getFrom();
//        start = System.currentTimeMillis();
//        sum = range.stream().mapToLong(Long::longValue).sum();
//        circleVersusMath.setForEachStreamTime(System.currentTimeMillis() - start);
//        circleVersusMath.setForEachStreamSum(Long.toString(sum));

        return circleVersusMath;
    }

    @Override
    public Long convertStringToNumberAndFindSum(String value) {

        long number = Long.parseLong(value);
        long sum = 0;
        for (int i = 0; i < value.length(); i++) {
            long mod = number % 10;
            sum += mod;
            number = number - mod;
            number /= 10;
        }

        return sum;
    }
}
