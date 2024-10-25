package com.forsale.app.ui.recyclerviewitems.imageandvideoslider;

import com.forsale.app.utils.OneShotEventHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ImageSliderItemViewModel.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f39482a;

    /* renamed from: b  reason: collision with root package name */
    private final OneShotEventHandler<Integer> f39483b;

    /* renamed from: c  reason: collision with root package name */
    private final OneShotEventHandler<Integer> f39484c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<p> f39485d;

    public d(ArrayList<String> images) {
        o.i(images, "images");
        this.f39482a = images;
        this.f39483b = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39484c = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39485d = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final void a() {
        OneShotEventHandler.d(this.f39485d, null, 1, null);
    }

    public final OneShotEventHandler<p> b() {
        return this.f39485d;
    }

    public final ArrayList<String> c() {
        return this.f39482a;
    }

    public final OneShotEventHandler<Integer> d() {
        return this.f39483b;
    }

    public final OneShotEventHandler<Integer> e() {
        return this.f39484c;
    }

    public final void f(int i11) {
        this.f39483b.i(Integer.valueOf(i11));
    }

    public final void g(int i11) {
        this.f39484c.i(Integer.valueOf(i11));
    }
}
