package racingcar.domain;

@FunctionalInterface
public interface MovableStrategy {
    boolean canMove();
}