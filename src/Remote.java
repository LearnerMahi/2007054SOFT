
   public class Remote {
        protected TV tv;

        Remote() {
            tv = null;
        }

        Remote(TV tv) {
            this.tv = tv;
        }

        public void togglePower() {
            if (tv.isEnabled()) {
                tv.disable();
                System.out.println("Power off");
            } else {
                tv.enable();
                System.out.println("Power on");
            }
        }

        public void volumeUp() {
            if (tv.isEnabled()) {
                tv.setVolume(tv.getVolume() + 5);
                System.out.println("Increase volume ");
            } else {
                System.out.println("Power off");
            }
        }

        public void volumeDown() {
            if (tv.isEnabled()) {
                tv.setVolume(tv.getVolume() - 5);
                System.out.println("Decrease volume ");
            } else {
                System.out.println("Power off");
            }
        }

        public void channelUp() {
            if (tv.isEnabled()) {
                tv.setChannel(tv.getChannel() + 1);
                System.out.println("Channel change ");
            } else {
                System.out.println("Power off");
            }
        }

        public void channelDown() {
            if (tv.isEnabled()) {
                tv.setChannel(tv.getChannel() - 1);
                System.out.println("Channel change ");
            } else {
                System.out.println("Power off");
            }
        }
    }


