class GeneralTV implements TV {
    boolean powerOn = false;
    int volume = 20;
    int channel = 1;

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
}