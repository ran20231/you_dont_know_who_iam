package com.forsale.app.ui.bottomsheets.selector;

import androidx.lifecycle.b0;
import androidx.lifecycle.q0;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import hi.b;
import hi.d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import nh.a;
import wz.p;
/* compiled from: SelectorViewModel.kt */
/* loaded from: classes3.dex */
public final class SelectorViewModel<T extends b> extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final a<T> f39100a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<T> f39101b;

    /* renamed from: c  reason: collision with root package name */
    private final OneShotEventHandler<p> f39102c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<p> f39103d;

    public SelectorViewModel(a<T> selector) {
        o.i(selector, "selector");
        this.f39100a = selector;
        this.f39101b = new b0<>();
        this.f39102c = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39103d = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> e() {
        return this.f39103d;
    }

    public final OneShotEventHandler<p> f() {
        return this.f39102c;
    }

    public final b0<T> g() {
        return this.f39101b;
    }

    public final a<T> h() {
        return this.f39100a;
    }

    public final d<T> j(T item) {
        int i11;
        int i12;
        o.i(item, "item");
        T value = this.f39101b.getValue();
        if (value != null) {
            i11 = value.getSelectedId();
        } else {
            i11 = -1;
        }
        Integer c11 = this.f39100a.c();
        if (c11 != null) {
            i12 = c11.intValue();
        } else {
            i12 = -1;
        }
        return new d<>(item, i11, i12, new l<List<? extends T>, p>(this) { // from class: com.forsale.app.ui.bottomsheets.selector.SelectorViewModel$initViewModel$1

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SelectorViewModel<T> f39104a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f39104a = this;
            }

            public final void b(List<? extends T> list) {
                boolean z11;
                Object k02;
                List<? extends T> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    b0<T> g11 = this.f39104a.g();
                    k02 = CollectionsKt___CollectionsKt.k0(list);
                    g11.postValue((T) k02);
                    return;
                }
                this.f39104a.g().postValue(null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Object obj) {
                b((List) obj);
                return p.f75480a;
            }
        }, false, 16, null);
    }

    public final void k() {
        OneShotEventHandler.d(this.f39103d, null, 1, null);
    }

    public final void l() {
        this.f39102c.i(p.f75480a);
    }
}
