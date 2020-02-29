import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

public class PlayerDB {
    public static class PlayerData{
        public int id;
        public String name;
        public String uuid;
        public String country;
        public String country_code;
        public String language;
        public boolean isAdmin;
        public int placecount;
        public int breakcount;
        public int killcount;
        public int deathcount;
        public int joincount;
        public int kickcount;
        public int level;
        public int exp;
        public int reqexp;
        public String reqtotalexp;
        public String firstdate;
        public String lastdate;
        public String lastplacename;
        public String lastbreakname;
        public String lastchat;
        public String playtime;
        public int attackclear;
        public int pvpwincount;
        public int pvplosecount;
        public int pvpbreakout;
        public int reactorcount;
        public int bantimeset;
        public String bantime;
        public boolean banned;
        public boolean translate;
        public boolean crosschat;
        public boolean colornick;
        public boolean connected;
        public String connserver;
        public String permission;
        public boolean mute;
        public Long udid;
        public String email;
        public String accountid;
        public String accountpw;

        public boolean error;
        public boolean isLogin;

        public LocalTime afk = LocalTime.of(0,0,0);
        public int afk_tilex = 0;
        public int afk_tiley = 0;

        public int grief_build_count = 0;
        public int grief_destory_count = 0;
        public ArrayList<short[]> grief_tilelist = new ArrayList<>();

        public Locale locale = new Locale(System.getProperty("user.language"), System.getProperty("user.country"));

        PlayerData(boolean error, boolean isLogin){
            this.error = error;
            this.isLogin = isLogin;
        }

        public PlayerData(int id, String name, String uuid, String country, String country_code, String language, boolean isAdmin, int placecount, int breakcount, int killcount, int deathcount, int joincount, int kickcount, int level, int exp, int reqexp, String reqtotalexp, String firstdate, String lastdate, String lastplacename, String lastbreakname, String lastchat, String playtime, int attackclear, int pvpwincount, int pvplosecount, int pvpbreakout, int reactorcount, int bantimeset, String bantime, boolean banned, boolean translate, boolean crosschat, boolean colornick, boolean connected, String connserver, String permission, boolean mute, Long udid, String email, String accountid, String accountpw, boolean error, boolean isLogin, Locale locale) {
            this.id = id;
            this.name = name;
            this.uuid = uuid;
            this.country = country;
            this.country_code = country_code;
            this.language = language;
            this.isAdmin = isAdmin;
            this.placecount = placecount;
            this.breakcount = breakcount;
            this.killcount = killcount;
            this.deathcount = deathcount;
            this.joincount = joincount;
            this.kickcount = kickcount;
            this.level = level;
            this.exp = exp;
            this.reqexp = reqexp;
            this.reqtotalexp = reqtotalexp;
            this.firstdate = firstdate;
            this.lastdate = lastdate;
            this.lastplacename = lastplacename;
            this.lastbreakname = lastbreakname;
            this.lastchat = lastchat;
            this.playtime = playtime;
            this.attackclear = attackclear;
            this.pvpwincount = pvpwincount;
            this.pvplosecount = pvplosecount;
            this.pvpbreakout = pvpbreakout;
            this.reactorcount = reactorcount;
            this.bantimeset = bantimeset;
            this.bantime = bantime;
            this.banned = banned;
            this.translate = translate;
            this.crosschat = crosschat;
            this.colornick = colornick;
            this.connected = connected;
            this.connserver = connserver;
            this.permission = permission;
            this.mute = mute;
            this.udid = udid;
            this.email = email;
            this.accountid = accountid;
            this.accountpw = accountpw;
            this.error = error;
            this.isLogin = isLogin;

            this.locale = locale;
        }
    }
}