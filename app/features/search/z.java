package com.forsale.app.features.search;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.utils.analytics.SearchSource;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SearchFocusFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class z implements z3.h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f37026f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f37027a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37028b;

    /* renamed from: c  reason: collision with root package name */
    private final SearchSource f37029c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37030d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37031e;

    /* compiled from: SearchFocusFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(Bundle bundle) {
            String str;
            boolean z11;
            SearchSource searchSource;
            int i11;
            int i12;
            kotlin.jvm.internal.o.i(bundle, "bundle");
            bundle.setClassLoader(z.class.getClassLoader());
            if (bundle.containsKey("SEARCH_KEYWORD")) {
                str = bundle.getString("SEARCH_KEYWORD");
            } else {
                str = null;
            }
            String str2 = str;
            if (bundle.containsKey("GO_TO_SEARCH_RESULTS")) {
                z11 = bundle.getBoolean("GO_TO_SEARCH_RESULTS");
            } else {
                z11 = false;
            }
            if (bundle.containsKey("SEARCH_SOURCE")) {
                if (!Parcelable.class.isAssignableFrom(SearchSource.class) && !Serializable.class.isAssignableFrom(SearchSource.class)) {
                    throw new UnsupportedOperationException(SearchSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchSource = (SearchSource) bundle.get("SEARCH_SOURCE");
                if (searchSource == null) {
                    throw new IllegalArgumentException("Argument \"SEARCH_SOURCE\" is marked as non-null but was passed a null value.");
                }
            } else {
                searchSource = SearchSource.SEARCH_BAR;
            }
            SearchSource searchSource2 = searchSource;
            if (bundle.containsKey("SEARCH_HISTORY_COUNT")) {
                i11 = bundle.getInt("SEARCH_HISTORY_COUNT");
            } else {
                i11 = 0;
            }
            if (bundle.containsKey("SEARCH_ITEM_ORDER")) {
                i12 = bundle.getInt("SEARCH_ITEM_ORDER");
            } else {
                i12 = 0;
            }
            return new z(str2, z11, searchSource2, i11, i12);
        }
    }

    public z() {
        this(null, false, null, 0, 0, 31, null);
    }

    public static final z fromBundle(Bundle bundle) {
        return f37026f.a(bundle);
    }

    public final boolean a() {
        return this.f37028b;
    }

    public final int b() {
        return this.f37030d;
    }

    public final int c() {
        return this.f37031e;
    }

    public final String d() {
        return this.f37027a;
    }

    public final SearchSource e() {
        return this.f37029c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.o.d(this.f37027a, zVar.f37027a) && this.f37028b == zVar.f37028b && this.f37029c == zVar.f37029c && this.f37030d == zVar.f37030d && this.f37031e == zVar.f37031e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        String str = this.f37027a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        boolean z11 = this.f37028b;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        return ((((((i11 + i12) * 31) + this.f37029c.hashCode()) * 31) + Integer.hashCode(this.f37030d)) * 31) + Integer.hashCode(this.f37031e);
    }

    public String toString() {
        String str = this.f37027a;
        boolean z11 = this.f37028b;
        SearchSource searchSource = this.f37029c;
        int i11 = this.f37030d;
        int i12 = this.f37031e;
        return "SearchFocusFragmentArgs(SEARCHKEYWORD=" + str + ", GOTOSEARCHRESULTS=" + z11 + ", SEARCHSOURCE=" + searchSource + ", SEARCHHISTORYCOUNT=" + i11 + ", SEARCHITEMORDER=" + i12 + ")";
    }

    public z(String str, boolean z11, SearchSource SEARCHSOURCE, int i11, int i12) {
        kotlin.jvm.internal.o.i(SEARCHSOURCE, "SEARCHSOURCE");
        this.f37027a = str;
        this.f37028b = z11;
        this.f37029c = SEARCHSOURCE;
        this.f37030d = i11;
        this.f37031e = i12;
    }

    public /* synthetic */ z(String str, boolean z11, SearchSource searchSource, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) == 0 ? i12 : 0);
    }
}
