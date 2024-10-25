package com.forsale.app.ui.recyclerviewitems.horizontalChips;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import bi.b;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewPadding;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import lj.a;
import sj.d;
import t9.r0;
import wz.h;
import wz.p;
/* compiled from: HorizontalChipsItemViewModel.kt */
/* loaded from: classes3.dex */
public final class HorizontalChipsItemViewModel extends b<List<? extends b<?>>> implements lj.a {

    /* renamed from: h */
    public static final a f39457h = new a(null);

    /* renamed from: i */
    public static final int f39458i = 8;

    /* renamed from: c */
    private final LiveData<List<b<?>>> f39459c;

    /* renamed from: d */
    private final int f39460d;

    /* renamed from: e */
    private final ViewPadding f39461e;

    /* renamed from: f */
    private final OneShotEventHandler<p> f39462f;

    /* renamed from: g */
    private final h f39463g;

    /* compiled from: HorizontalChipsItemViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List b(a aVar, LiveData liveData, LiveData liveData2, OneShotEventHandler oneShotEventHandler, int i11, ViewPadding viewPadding, ViewMargins viewMargins, int i12, Object obj) {
            OneShotEventHandler oneShotEventHandler2;
            int i13;
            ViewPadding viewPadding2;
            ViewMargins viewMargins2;
            if ((i12 & 4) != 0) {
                oneShotEventHandler2 = null;
            } else {
                oneShotEventHandler2 = oneShotEventHandler;
            }
            if ((i12 & 8) != 0) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            if ((i12 & 16) != 0) {
                viewPadding2 = null;
            } else {
                viewPadding2 = viewPadding;
            }
            if ((i12 & 32) != 0) {
                viewMargins2 = null;
            } else {
                viewMargins2 = viewMargins;
            }
            return aVar.a(liveData, liveData2, oneShotEventHandler2, i13, viewPadding2, viewMargins2);
        }

        public final List<b<?>> a(LiveData<TextHolder> title, LiveData<List<b<?>>> listings, OneShotEventHandler<p> oneShotEventHandler, int i11, ViewPadding viewPadding, ViewMargins viewMargins) {
            List<b<?>> q11;
            o.i(title, "title");
            o.i(listings, "listings");
            q11 = r.q(new li.b(title, viewMargins, Integer.valueOf(d.J)), new HorizontalChipsItemViewModel(listings, i11, viewPadding, oneShotEventHandler));
            return q11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalChipsItemViewModel(LiveData<List<b<?>>> listings, int i11, ViewPadding viewPadding, OneShotEventHandler<p> oneShotEventHandler) {
        super(r0.f69861c5, null);
        h a11;
        o.i(listings, "listings");
        this.f39459c = listings;
        this.f39460d = i11;
        this.f39461e = viewPadding;
        this.f39462f = oneShotEventHandler;
        a11 = kotlin.d.a(new g00.a<b0<Bundle>>() { // from class: com.forsale.app.ui.recyclerviewitems.horizontalChips.HorizontalChipsItemViewModel$layoutManagerState$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<Bundle> invoke() {
                return new b0<>();
            }
        });
        this.f39463g = a11;
    }

    public final LiveData<List<b<?>>> a() {
        return this.f39459c;
    }

    @Override // lj.a
    public Parcelable b(String str) {
        return a.C0733a.a(this, str);
    }

    @Override // lj.a
    public b0<Bundle> c() {
        return (b0) this.f39463g.getValue();
    }

    @Override // lj.a
    public void d(Parcelable parcelable, String str) {
        a.C0733a.c(this, parcelable, str);
    }

    public final ViewPadding e() {
        return this.f39461e;
    }

    public final OneShotEventHandler<p> f() {
        return this.f39462f;
    }

    public final int g() {
        return this.f39460d;
    }
}
