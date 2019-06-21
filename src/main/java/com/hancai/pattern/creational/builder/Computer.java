package com.hancai.pattern.creational.builder;

import lombok.ToString;

/**
 * 建造者模式 builder —— 链式编程
 *
 * @author diaohancai
 */
@ToString
public class Computer {

    private String cpu;
    private String mainboard;
    private String memory;
    private String hardDisk;
    private String solidStateHardDisk;
    private String graphicsCard;
    private double price;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.mainboard = builder.mainboard;
        this.memory = builder.memory;
        this.hardDisk = builder.hardDisk;
        this.solidStateHardDisk = builder.solidStateHardDisk;
        this.graphicsCard = builder.graphicsCard;
        this.price = builder.price;
    }

    /**
     * 内嵌 Builder
     */
    public static class ComputerBuilder {

        private String cpu;
        private String mainboard;
        private String memory;
        private String hardDisk;
        private String solidStateHardDisk;
        private String graphicsCard;
        private double price;

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder hardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public ComputerBuilder solidStateHardDisk(String solidStateHardDisk) {
            this.solidStateHardDisk = solidStateHardDisk;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder price(double price) {
            this.price = price;
            return this;
        }

        /**
         * 构建
         *
         * @return
         */
        public Computer build() {
            return new Computer(this);
        }

    }

}
