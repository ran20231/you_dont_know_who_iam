package com.forsale.ui.components.skeleton;

import androidx.compose.animation.core.RepeatMode;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.Lambda;
import r.g;
import r.n0;
/* compiled from: skeleton.kt */
/* loaded from: classes3.dex */
final class VerticalLinearShimmer$animationSpec$2 extends Lambda implements g00.a<n0<Float>> {

    /* renamed from: a  reason: collision with root package name */
    public static final VerticalLinearShimmer$animationSpec$2 f42758a = new VerticalLinearShimmer$animationSpec$2();

    VerticalLinearShimmer$animationSpec$2() {
        super(0);
    }

    @Override // g00.a
    /* renamed from: b */
    public final n0<Float> invoke() {
        return g.d(g.k(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, null, 4, null), RepeatMode.Restart, 0L, 4, null);
    }
}
