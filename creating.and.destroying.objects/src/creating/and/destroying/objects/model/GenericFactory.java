package creating.and.destroying.objects.model;

public interface GenericFactory<T> {
    // Static factory method with generics
    static <T> GenericFactory<T> createInstance(T value) {
        return new GenericFactoryImpl<>(value);
    }

    // Some method(s) to define the behavior of the interface
    void performAction();

    // Implementation class for GenericFactory interface
    class GenericFactoryImpl<T> implements GenericFactory<T> {
        private final T value;

        // Private constructor to be called by the static factory method
        private GenericFactoryImpl(T value) {
            this.value = value;
        }

        @Override
        public void performAction() {
            // Implementation of the action
            System.out.println("Performing action with value: " + value);
        }
    }
}