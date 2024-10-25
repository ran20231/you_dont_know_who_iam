package com.forsale.app.datalayer.network.requestsbodies;

import a00.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.y0;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetMyListingsBody.kt */
/* loaded from: classes2.dex */
public abstract class MyListingsType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MyListingsType[] $VALUES;
    public static final Companion Companion;
    private final String value;
    @c(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public static final MyListingsType ACTIVE = new MyListingsType("ACTIVE", 0) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsType.ACTIVE
        private String parentDisplayedName;
        private int choiceId = 1;
        private String displayedName = "Active";
        private boolean isChosen = true;
        private Integer choicableResId = Integer.valueOf(y0.f70590na);

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public Integer getChoicableResId() {
            return this.choicableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public int getChoiceId() {
            return this.choiceId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getDisplayedName() {
            return this.displayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getParentDisplayedName() {
            return this.parentDisplayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public boolean isChosen() {
            return this.isChosen;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoicableResId(Integer num) {
            this.choicableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoiceId(int i11) {
            this.choiceId = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChosen(boolean z11) {
            this.isChosen = z11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setDisplayedName(String str) {
            o.i(str, "<set-?>");
            this.displayedName = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setParentDisplayedName(String str) {
            this.parentDisplayedName = str;
        }
    };
    @c("waiting_approval")
    public static final MyListingsType WAITING_APPROVAL = new MyListingsType("WAITING_APPROVAL", 1) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsType.WAITING_APPROVAL
        private boolean isChosen;
        private String parentDisplayedName;
        private int choiceId = 2;
        private String displayedName = "Waiting Approval";
        private Integer choicableResId = Integer.valueOf(y0.f70658ra);

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public Integer getChoicableResId() {
            return this.choicableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public int getChoiceId() {
            return this.choiceId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getDisplayedName() {
            return this.displayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getParentDisplayedName() {
            return this.parentDisplayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public boolean isChosen() {
            return this.isChosen;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoicableResId(Integer num) {
            this.choicableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoiceId(int i11) {
            this.choiceId = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChosen(boolean z11) {
            this.isChosen = z11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setDisplayedName(String str) {
            o.i(str, "<set-?>");
            this.displayedName = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setParentDisplayedName(String str) {
            this.parentDisplayedName = str;
        }
    };
    @c("archive")
    public static final MyListingsType ARCHIVE = new MyListingsType("ARCHIVE", 2) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsType.ARCHIVE
        private boolean isChosen;
        private String parentDisplayedName;
        private int choiceId = 4;
        private String displayedName = "Archived";
        private Integer choicableResId = Integer.valueOf(y0.f70607oa);

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public Integer getChoicableResId() {
            return this.choicableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public int getChoiceId() {
            return this.choiceId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getDisplayedName() {
            return this.displayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public String getParentDisplayedName() {
            return this.parentDisplayedName;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public boolean isChosen() {
            return this.isChosen;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoicableResId(Integer num) {
            this.choicableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChoiceId(int i11) {
            this.choiceId = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setChosen(boolean z11) {
            this.isChosen = z11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setDisplayedName(String str) {
            o.i(str, "<set-?>");
            this.displayedName = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsType
        public void setParentDisplayedName(String str) {
            this.parentDisplayedName = str;
        }
    };

    /* compiled from: GetMyListingsBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetSelected() {
            if (!MyListingsType.ACTIVE.isChosen()) {
                for (MyListingsType myListingsType : MyListingsType.values()) {
                    myListingsType.setChosen(false);
                }
                MyListingsType.ACTIVE.setChosen(true);
            }
        }
    }

    private static final /* synthetic */ MyListingsType[] $values() {
        return new MyListingsType[]{ACTIVE, WAITING_APPROVAL, ARCHIVE};
    }

    static {
        MyListingsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new Companion(null);
    }

    public /* synthetic */ MyListingsType(String str, int i11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2);
    }

    public static a<MyListingsType> getEntries() {
        return $ENTRIES;
    }

    public static MyListingsType valueOf(String str) {
        return (MyListingsType) Enum.valueOf(MyListingsType.class, str);
    }

    public static MyListingsType[] values() {
        return (MyListingsType[]) $VALUES.clone();
    }

    public abstract /* synthetic */ Integer getChoicableResId();

    public abstract /* synthetic */ int getChoiceId();

    public abstract /* synthetic */ String getDisplayedName();

    public abstract /* synthetic */ String getParentDisplayedName();

    public final String getValue() {
        return this.value;
    }

    public abstract /* synthetic */ boolean isChosen();

    public abstract /* synthetic */ void setChoicableResId(Integer num);

    public abstract /* synthetic */ void setChoiceId(int i11);

    public abstract /* synthetic */ void setChosen(boolean z11);

    public abstract /* synthetic */ void setDisplayedName(String str);

    public abstract /* synthetic */ void setParentDisplayedName(String str);

    private MyListingsType(String str, int i11, String str2) {
        this.value = str2;
    }
}
