package systemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Текущий профиль - dev";
    }
}