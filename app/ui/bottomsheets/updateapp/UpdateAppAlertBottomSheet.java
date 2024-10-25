package com.forsale.app.ui.bottomsheets.updateapp;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ActionModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ImageModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.itemutils.TextHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.q0;
import t9.y0;
import wz.p;
/* compiled from: UpdateAppAlertBottomSheet.kt */
/* loaded from: classes3.dex */
public final class UpdateAppAlertBottomSheet {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39158b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f39159c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final AlertModel f39160a;

    /* compiled from: UpdateAppAlertBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AlertModel a() {
            return new AlertModel(true, PostAdDialogs.UpdateApp, new ImageModel(q0.f69780n2, null, 2, null), new TextModel(new TextHolder(Integer.valueOf(y0.f70694te), null, null, 6, null), null, 0, 6, null), new TextModel(new TextHolder(Integer.valueOf(y0.f70726ve), null, null, 6, null), null, 2, 2, null), null, new ActionModel(new TextHolder(Integer.valueOf(y0.f70710ue), null, null, 6, null), null, 2, null), null, 160, null);
        }
    }

    public UpdateAppAlertBottomSheet(AlertModel model) {
        o.i(model, "model");
        this.f39160a = model;
    }

    public final void a(FragmentManager fragmentManager, final Context context) {
        o.i(fragmentManager, "fragmentManager");
        o.i(context, "context");
        AlertBottomSheet.a.c(AlertBottomSheet.D, this.f39160a, new g00.a<p>() { // from class: com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet$show$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ContextExtensionsKt.G(context);
            }
        }, null, null, fragmentManager, 12, null);
    }

    public /* synthetic */ UpdateAppAlertBottomSheet(AlertModel alertModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f39158b.a() : alertModel);
    }
}
