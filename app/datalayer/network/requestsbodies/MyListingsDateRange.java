package com.forsale.app.datalayer.network.requestsbodies;

import a00.a;
import hi.b;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.y0;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetMyListingsBody.kt */
/* loaded from: classes2.dex */
public abstract class MyListingsDateRange implements b, Serializable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MyListingsDateRange[] $VALUES;
    private final String value;
    @c("latest")
    public static final MyListingsDateRange LATEST = new MyListingsDateRange("LATEST", 0) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange.LATEST
        private List<Integer> cousinIdsList;
        private int displayOrderSort;
        private Integer parentID;
        private Integer selectableResId;
        private int selectedId = 1;
        private String label = "Latest";
        private String labelAr = "Latest";
        private String labelEn = "Latest";

        {
            List<Integer> n11;
            n11 = r.n();
            this.cousinIdsList = n11;
            this.selectableResId = Integer.valueOf(y0.f70454f9);
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public List<Integer> getCousinIdsList() {
            return this.cousinIdsList;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getDisplayOrderSort() {
            return this.displayOrderSort;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabel() {
            return this.label;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelAr() {
            return this.labelAr;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelEn() {
            return this.labelEn;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getParentID() {
            return this.parentID;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getSelectableResId() {
            return this.selectableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getSelectedId() {
            return this.selectedId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setCousinIdsList(List<Integer> list) {
            o.i(list, "<set-?>");
            this.cousinIdsList = list;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setDisplayOrderSort(int i11) {
            this.displayOrderSort = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabel(String str) {
            o.i(str, "<set-?>");
            this.label = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelAr(String str) {
            o.i(str, "<set-?>");
            this.labelAr = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelEn(String str) {
            o.i(str, "<set-?>");
            this.labelEn = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setParentID(Integer num) {
            this.parentID = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setSelectableResId(Integer num) {
            this.selectableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public void setSelectedId(int i11) {
            this.selectedId = i11;
        }
    };
    @c("this_year")
    public static final MyListingsDateRange THIS_YEAR = new MyListingsDateRange("THIS_YEAR", 1) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange.THIS_YEAR
        private List<Integer> cousinIdsList;
        private int displayOrderSort;
        private Integer parentID;
        private Integer selectableResId;
        private int selectedId = 2;
        private String label = "This Year";
        private String labelAr = "This Year";
        private String labelEn = "This Year";

        {
            List<Integer> n11;
            n11 = r.n();
            this.cousinIdsList = n11;
            this.selectableResId = Integer.valueOf(y0.f70471g9);
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public List<Integer> getCousinIdsList() {
            return this.cousinIdsList;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getDisplayOrderSort() {
            return this.displayOrderSort;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabel() {
            return this.label;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelAr() {
            return this.labelAr;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelEn() {
            return this.labelEn;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getParentID() {
            return this.parentID;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getSelectableResId() {
            return this.selectableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getSelectedId() {
            return this.selectedId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setCousinIdsList(List<Integer> list) {
            o.i(list, "<set-?>");
            this.cousinIdsList = list;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setDisplayOrderSort(int i11) {
            this.displayOrderSort = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabel(String str) {
            o.i(str, "<set-?>");
            this.label = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelAr(String str) {
            o.i(str, "<set-?>");
            this.labelAr = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelEn(String str) {
            o.i(str, "<set-?>");
            this.labelEn = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setParentID(Integer num) {
            this.parentID = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setSelectableResId(Integer num) {
            this.selectableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public void setSelectedId(int i11) {
            this.selectedId = i11;
        }
    };
    @c("all")
    public static final MyListingsDateRange ALL = new MyListingsDateRange("ALL", 2) { // from class: com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange.ALL
        private List<Integer> cousinIdsList;
        private int displayOrderSort;
        private Integer parentID;
        private Integer selectableResId;
        private int selectedId = 3;
        private String label = "All";
        private String labelAr = "All";
        private String labelEn = "All";

        {
            List<Integer> n11;
            n11 = r.n();
            this.cousinIdsList = n11;
            this.selectableResId = Integer.valueOf(y0.f70437e9);
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public List<Integer> getCousinIdsList() {
            return this.cousinIdsList;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getDisplayOrderSort() {
            return this.displayOrderSort;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabel() {
            return this.label;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelAr() {
            return this.labelAr;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public String getLabelEn() {
            return this.labelEn;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getParentID() {
            return this.parentID;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public Integer getSelectableResId() {
            return this.selectableResId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public int getSelectedId() {
            return this.selectedId;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setCousinIdsList(List<Integer> list) {
            o.i(list, "<set-?>");
            this.cousinIdsList = list;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setDisplayOrderSort(int i11) {
            this.displayOrderSort = i11;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabel(String str) {
            o.i(str, "<set-?>");
            this.label = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelAr(String str) {
            o.i(str, "<set-?>");
            this.labelAr = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setLabelEn(String str) {
            o.i(str, "<set-?>");
            this.labelEn = str;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setParentID(Integer num) {
            this.parentID = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange
        public void setSelectableResId(Integer num) {
            this.selectableResId = num;
        }

        @Override // com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, hi.b
        public void setSelectedId(int i11) {
            this.selectedId = i11;
        }
    };

    private static final /* synthetic */ MyListingsDateRange[] $values() {
        return new MyListingsDateRange[]{LATEST, THIS_YEAR, ALL};
    }

    static {
        MyListingsDateRange[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    public /* synthetic */ MyListingsDateRange(String str, int i11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2);
    }

    public static a<MyListingsDateRange> getEntries() {
        return $ENTRIES;
    }

    public static MyListingsDateRange valueOf(String str) {
        return (MyListingsDateRange) Enum.valueOf(MyListingsDateRange.class, str);
    }

    public static MyListingsDateRange[] values() {
        return (MyListingsDateRange[]) $VALUES.clone();
    }

    @Override // hi.b
    public abstract /* synthetic */ List getCousinIdsList();

    @Override // hi.b
    public abstract /* synthetic */ int getDisplayOrderSort();

    @Override // hi.b
    public abstract /* synthetic */ String getLabel();

    @Override // hi.b
    public abstract /* synthetic */ String getLabelAr();

    @Override // hi.b
    public abstract /* synthetic */ String getLabelEn();

    @Override // hi.b
    public abstract /* synthetic */ Integer getParentID();

    @Override // hi.b
    public abstract /* synthetic */ Integer getSelectableResId();

    @Override // hi.b
    public abstract /* synthetic */ int getSelectedId();

    public final String getValue() {
        return this.value;
    }

    public abstract /* synthetic */ void setCousinIdsList(List list);

    public abstract /* synthetic */ void setDisplayOrderSort(int i11);

    public abstract /* synthetic */ void setLabel(String str);

    public abstract /* synthetic */ void setLabelAr(String str);

    public abstract /* synthetic */ void setLabelEn(String str);

    public abstract /* synthetic */ void setParentID(Integer num);

    public abstract /* synthetic */ void setSelectableResId(Integer num);

    @Override // hi.b
    public abstract /* synthetic */ void setSelectedId(int i11);

    private MyListingsDateRange(String str, int i11, String str2) {
        this.value = str2;
    }
}
