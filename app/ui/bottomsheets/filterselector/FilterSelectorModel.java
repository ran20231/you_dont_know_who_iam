package com.forsale.app.ui.bottomsheets.filterselector;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import hi.b;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: FilterSelectorModel.kt */
/* loaded from: classes3.dex */
public final class FilterSelectorModel<T extends b> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f38061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38062b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Integer> f38063c;

    /* renamed from: d  reason: collision with root package name */
    private final FilterSelectorDisplayType f38064d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f38065e;

    /* renamed from: f  reason: collision with root package name */
    private final ListingsResponse.UISettings.FiltrationSetting.SelectionType f38066f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f38067g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f38068h;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterSelectorModel(List<? extends T> list, String title, List<Integer> list2, FilterSelectorDisplayType filterSelectorDisplayType, Integer num, ListingsResponse.UISettings.FiltrationSetting.SelectionType selectorType, Integer num2) {
        o.i(list, "list");
        o.i(title, "title");
        o.i(selectorType, "selectorType");
        this.f38061a = list;
        this.f38062b = title;
        this.f38063c = list2;
        this.f38064d = filterSelectorDisplayType;
        this.f38065e = num;
        this.f38066f = selectorType;
        this.f38067g = num2;
        this.f38068h = list.size() > 10;
    }

    public final boolean a() {
        return this.f38068h;
    }

    public final List<T> b() {
        return this.f38061a;
    }

    public final Integer c() {
        return this.f38067g;
    }

    public final Integer d() {
        return this.f38065e;
    }

    public final List<Integer> e() {
        return this.f38063c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterSelectorModel)) {
            return false;
        }
        FilterSelectorModel filterSelectorModel = (FilterSelectorModel) obj;
        if (o.d(this.f38061a, filterSelectorModel.f38061a) && o.d(this.f38062b, filterSelectorModel.f38062b) && o.d(this.f38063c, filterSelectorModel.f38063c) && this.f38064d == filterSelectorModel.f38064d && o.d(this.f38065e, filterSelectorModel.f38065e) && this.f38066f == filterSelectorModel.f38066f && o.d(this.f38067g, filterSelectorModel.f38067g)) {
            return true;
        }
        return false;
    }

    public final FilterSelectorDisplayType f() {
        return this.f38064d;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.SelectionType g() {
        return this.f38066f;
    }

    public final String h() {
        return this.f38062b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.f38061a.hashCode() * 31) + this.f38062b.hashCode()) * 31;
        List<Integer> list = this.f38063c;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = (hashCode4 + hashCode) * 31;
        FilterSelectorDisplayType filterSelectorDisplayType = this.f38064d;
        if (filterSelectorDisplayType == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = filterSelectorDisplayType.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num = this.f38065e;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int hashCode5 = (((i13 + hashCode3) * 31) + this.f38066f.hashCode()) * 31;
        Integer num2 = this.f38067g;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return hashCode5 + i11;
    }

    public String toString() {
        List<T> list = this.f38061a;
        String str = this.f38062b;
        List<Integer> list2 = this.f38063c;
        FilterSelectorDisplayType filterSelectorDisplayType = this.f38064d;
        Integer num = this.f38065e;
        ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = this.f38066f;
        Integer num2 = this.f38067g;
        return "FilterSelectorModel(list=" + list + ", title=" + str + ", preSelectedIds=" + list2 + ", selectorDisplayType=" + filterSelectorDisplayType + ", noItemsPerRow=" + num + ", selectorType=" + selectionType + ", maxSelectCount=" + num2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FilterSelectorModel(java.util.List r10, java.lang.String r11, java.util.List r12, com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType r13, java.lang.Integer r14, com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.SelectionType r15, java.lang.Integer r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto La
            java.util.List r0 = kotlin.collections.p.n()
            r4 = r0
            goto Lb
        La:
            r4 = r12
        Lb:
            r0 = r17 & 8
            if (r0 == 0) goto L13
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType r0 = com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType.LIST
            r5 = r0
            goto L14
        L13:
            r5 = r13
        L14:
            r0 = r17 & 16
            if (r0 == 0) goto L1f
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
            goto L20
        L1f:
            r6 = r14
        L20:
            r0 = r17 & 32
            if (r0 == 0) goto L28
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$SelectionType r0 = com.forsale.app.datalayer.network.responses.ListingsResponse.UISettings.FiltrationSetting.SelectionType.SINGLE
            r7 = r0
            goto L29
        L28:
            r7 = r15
        L29:
            r0 = r17 & 64
            if (r0 == 0) goto L30
            r0 = 0
            r8 = r0
            goto L32
        L30:
            r8 = r16
        L32:
            r1 = r9
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel.<init>(java.util.List, java.lang.String, java.util.List, com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType, java.lang.Integer, com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting$SelectionType, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
