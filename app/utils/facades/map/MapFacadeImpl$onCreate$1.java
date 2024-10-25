package com.forsale.app.utils.facades.map;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.SupportMapFragment;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: MapFacadeImpl.kt */
/* loaded from: classes3.dex */
final class MapFacadeImpl$onCreate$1 extends Lambda implements g00.a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MapFacadeImpl f40182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl$onCreate$1(MapFacadeImpl mapFacadeImpl) {
        super(0);
        this.f40182a = mapFacadeImpl;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentManager fragmentManager;
        int i11;
        fragmentManager = this.f40182a.f40175h;
        if (fragmentManager == null) {
            o.w("fragmentManager");
            fragmentManager = null;
        }
        i11 = this.f40182a.f40168a;
        Fragment k02 = fragmentManager.k0(i11);
        if (k02 != null) {
            MapFacadeImpl mapFacadeImpl = this.f40182a;
            Context applicationContext = k02.requireContext().getApplicationContext();
            o.h(applicationContext, "getApplicationContext(...)");
            mapFacadeImpl.f40174g = applicationContext;
            ((SupportMapFragment) k02).getMapAsync(this.f40182a);
        }
    }
}
