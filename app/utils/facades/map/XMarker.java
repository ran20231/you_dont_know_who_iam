package com.forsale.app.utils.facades.map;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
public abstract class XMarker<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40191d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f40192e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final LatLng f40193a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f40194b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40195c;

    /* compiled from: XMarker.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: XMarker.kt */
        /* renamed from: com.forsale.app.utils.facades.map.XMarker$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0457a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f40196a;

            static {
                int[] iArr = new int[MarkerType.values().length];
                try {
                    iArr[MarkerType.PIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarkerType.CIRCLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f40196a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final XMarker<?> a(MarkerType markerType, LatLng latLng, Context ctx) {
            o.i(markerType, "markerType");
            o.i(latLng, "latLng");
            o.i(ctx, "ctx");
            int i11 = C0457a.f40196a[markerType.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new CircleMarker(latLng, ctx);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new PinMarker(latLng, ctx);
        }
    }

    public /* synthetic */ XMarker(LatLng latLng, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng, context);
    }

    private final boolean e(MarkerType markerType) {
        if (markerType == MarkerType.PIN && (this instanceof PinMarker)) {
            return true;
        }
        if (markerType == MarkerType.CIRCLE && (this instanceof CircleMarker)) {
            return true;
        }
        return false;
    }

    public abstract XMarker<T> a(GoogleMap googleMap);

    public final XMarker<?> b(LatLng latLng, GoogleMap googleMap) {
        XMarker<?> a11;
        o.i(latLng, "latLng");
        o.i(googleMap, "googleMap");
        if (this instanceof PinMarker) {
            a11 = f40191d.a(MarkerType.PIN, latLng, this.f40194b);
        } else if (this instanceof CircleMarker) {
            a11 = f40191d.a(MarkerType.CIRCLE, latLng, this.f40194b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        f();
        a11.a(googleMap);
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final XMarker<?> c(MarkerType markerType, GoogleMap googleMap) {
        o.i(markerType, "markerType");
        o.i(googleMap, "googleMap");
        if (e(markerType)) {
            return this;
        }
        XMarker<?> a11 = f40191d.a(markerType, this.f40193a, this.f40194b);
        f();
        a11.a(googleMap);
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AtomicReference<T> d() {
        return (AtomicReference) this.f40195c.getValue();
    }

    public abstract void f();

    private XMarker(LatLng latLng, Context context) {
        h a11;
        this.f40193a = latLng;
        this.f40194b = context;
        a11 = d.a(XMarker$marker$2.f40197a);
        this.f40195c = a11;
    }
}
