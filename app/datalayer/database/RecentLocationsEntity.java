package com.forsale.app.datalayer.database;

import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.o;
/* compiled from: RecentLocationsEntity.kt */
/* loaded from: classes2.dex */
public final class RecentLocationsEntity {
    public static final int $stable = 0;
    private final String arPath;
    private final String arTitle;
    private final String enPath;
    private final String enTitle;

    /* renamed from: id  reason: collision with root package name */
    private final int f22319id;
    private final long insertDate;
    private final int level;
    private final int parentId;
    private final String path;
    private final String title;
    private final int verticalId;

    public RecentLocationsEntity(int i11, int i12, int i13, String title, String arTitle, String enTitle, String path, String enPath, String arPath, long j11, int i14) {
        o.i(title, "title");
        o.i(arTitle, "arTitle");
        o.i(enTitle, "enTitle");
        o.i(path, "path");
        o.i(enPath, "enPath");
        o.i(arPath, "arPath");
        this.f22319id = i11;
        this.level = i12;
        this.parentId = i13;
        this.title = title;
        this.arTitle = arTitle;
        this.enTitle = enTitle;
        this.path = path;
        this.enPath = enPath;
        this.arPath = arPath;
        this.insertDate = j11;
        this.verticalId = i14;
    }

    public static /* synthetic */ RecentLocationsEntity copy$default(RecentLocationsEntity recentLocationsEntity, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, String str6, long j11, int i14, int i15, Object obj) {
        int i16;
        int i17;
        int i18;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j12;
        int i19;
        if ((i15 & 1) != 0) {
            i16 = recentLocationsEntity.f22319id;
        } else {
            i16 = i11;
        }
        if ((i15 & 2) != 0) {
            i17 = recentLocationsEntity.level;
        } else {
            i17 = i12;
        }
        if ((i15 & 4) != 0) {
            i18 = recentLocationsEntity.parentId;
        } else {
            i18 = i13;
        }
        if ((i15 & 8) != 0) {
            str7 = recentLocationsEntity.title;
        } else {
            str7 = str;
        }
        if ((i15 & 16) != 0) {
            str8 = recentLocationsEntity.arTitle;
        } else {
            str8 = str2;
        }
        if ((i15 & 32) != 0) {
            str9 = recentLocationsEntity.enTitle;
        } else {
            str9 = str3;
        }
        if ((i15 & 64) != 0) {
            str10 = recentLocationsEntity.path;
        } else {
            str10 = str4;
        }
        if ((i15 & 128) != 0) {
            str11 = recentLocationsEntity.enPath;
        } else {
            str11 = str5;
        }
        if ((i15 & 256) != 0) {
            str12 = recentLocationsEntity.arPath;
        } else {
            str12 = str6;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            j12 = recentLocationsEntity.insertDate;
        } else {
            j12 = j11;
        }
        if ((i15 & 1024) != 0) {
            i19 = recentLocationsEntity.verticalId;
        } else {
            i19 = i14;
        }
        return recentLocationsEntity.copy(i16, i17, i18, str7, str8, str9, str10, str11, str12, j12, i19);
    }

    public final int component1() {
        return this.f22319id;
    }

    public final long component10() {
        return this.insertDate;
    }

    public final int component11() {
        return this.verticalId;
    }

    public final int component2() {
        return this.level;
    }

    public final int component3() {
        return this.parentId;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.arTitle;
    }

    public final String component6() {
        return this.enTitle;
    }

    public final String component7() {
        return this.path;
    }

    public final String component8() {
        return this.enPath;
    }

    public final String component9() {
        return this.arPath;
    }

    public final RecentLocationsEntity copy(int i11, int i12, int i13, String title, String arTitle, String enTitle, String path, String enPath, String arPath, long j11, int i14) {
        o.i(title, "title");
        o.i(arTitle, "arTitle");
        o.i(enTitle, "enTitle");
        o.i(path, "path");
        o.i(enPath, "enPath");
        o.i(arPath, "arPath");
        return new RecentLocationsEntity(i11, i12, i13, title, arTitle, enTitle, path, enPath, arPath, j11, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentLocationsEntity)) {
            return false;
        }
        RecentLocationsEntity recentLocationsEntity = (RecentLocationsEntity) obj;
        if (this.f22319id == recentLocationsEntity.f22319id && this.level == recentLocationsEntity.level && this.parentId == recentLocationsEntity.parentId && o.d(this.title, recentLocationsEntity.title) && o.d(this.arTitle, recentLocationsEntity.arTitle) && o.d(this.enTitle, recentLocationsEntity.enTitle) && o.d(this.path, recentLocationsEntity.path) && o.d(this.enPath, recentLocationsEntity.enPath) && o.d(this.arPath, recentLocationsEntity.arPath) && this.insertDate == recentLocationsEntity.insertDate && this.verticalId == recentLocationsEntity.verticalId) {
            return true;
        }
        return false;
    }

    public final String getArPath() {
        return this.arPath;
    }

    public final String getArTitle() {
        return this.arTitle;
    }

    public final String getEnPath() {
        return this.enPath;
    }

    public final String getEnTitle() {
        return this.enTitle;
    }

    public final int getId() {
        return this.f22319id;
    }

    public final long getInsertDate() {
        return this.insertDate;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVerticalId() {
        return this.verticalId;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.f22319id) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.parentId)) * 31) + this.title.hashCode()) * 31) + this.arTitle.hashCode()) * 31) + this.enTitle.hashCode()) * 31) + this.path.hashCode()) * 31) + this.enPath.hashCode()) * 31) + this.arPath.hashCode()) * 31) + Long.hashCode(this.insertDate)) * 31) + Integer.hashCode(this.verticalId);
    }

    public String toString() {
        int i11 = this.f22319id;
        int i12 = this.level;
        int i13 = this.parentId;
        String str = this.title;
        String str2 = this.arTitle;
        String str3 = this.enTitle;
        String str4 = this.path;
        String str5 = this.enPath;
        String str6 = this.arPath;
        long j11 = this.insertDate;
        int i14 = this.verticalId;
        return "RecentLocationsEntity(id=" + i11 + ", level=" + i12 + ", parentId=" + i13 + ", title=" + str + ", arTitle=" + str2 + ", enTitle=" + str3 + ", path=" + str4 + ", enPath=" + str5 + ", arPath=" + str6 + ", insertDate=" + j11 + ", verticalId=" + i14 + ")";
    }
}
