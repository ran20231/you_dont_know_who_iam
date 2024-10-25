package com.forsale.app.features.categories.listings.generalListings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: GeneralListingsFragment.kt */
/* loaded from: classes2.dex */
public final class GeneralListingsFragment extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30451f = new a(null);

    /* compiled from: GeneralListingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"UnrememberedMutableState"})
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(1347389725, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1347389725, i11, -1, "com.forsale.app.features.categories.listings.generalListings.GeneralListingsFragment.onCreateView.<anonymous>.<anonymous> (GeneralListingsFragment.kt:54)");
                }
                final GeneralListingsFragment generalListingsFragment = GeneralListingsFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 2044246772, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.generalListings.GeneralListingsFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(2044246772, i12, -1, "com.forsale.app.features.categories.listings.generalListings.GeneralListingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (GeneralListingsFragment.kt:55)");
                        }
                        GeneralListingsFragment.this.q(null, aVar2, 0, 1);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel r23, androidx.compose.runtime.a r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.generalListings.GeneralListingsFragment.q(com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel, androidx.compose.runtime.a, int, int):void");
    }
}
