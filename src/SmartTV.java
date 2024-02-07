
    class SmartTV implements TV {
        boolean powerOn = false;
        int volume = 10;
        int channel = 5;

        @Override
        public boolean isEnabled() {
            return powerOn;
        }

        @Override
        public void enable() {
            powerOn = true;
        }

        @Override
        public void disable() {
            powerOn = false;
        }

        @Override
        public int getVolume() {
            return volume;
        }

        @Override
        public void setVolume(int vol) {
            volume = vol;
        }

        @Override
        public int getChannel() {
            return channel;
        }

        @Override
        public void setChannel(int channel) {
            this.channel = channel;
        }

        public void Youtube() {
            System.out.println("Youtube run in SmartTV");
        }
    }

