package com.forsale.app.utils;

import android.content.Context;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ActionModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.ImageModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModel;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.TextModelCustom;
import com.forsale.app.utils.itemutils.TextHolder;
import t9.y0;
/* compiled from: AlertSheetExtensions.kt */
/* loaded from: classes3.dex */
public final class c {
    public static final AlertModel a(Context context, String str, boolean z11, boolean z12, boolean z13, boolean z14, PostAdDialogs dialogType) {
        int i11;
        String str2;
        TextModel textModel;
        ActionModel actionModel;
        int i12;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(dialogType, "dialogType");
        ImageModel imageModel = new ImageModel(t9.q0.f69826z0, null, 2, null);
        if (z11) {
            i11 = y0.Ke;
        } else {
            i11 = y0.Be;
        }
        TextModel textModel2 = new TextModel(new TextHolder(Integer.valueOf(i11), null, null, 6, null), null, 0, 6, null);
        TextModel textModel3 = new TextModel(new TextHolder(Integer.valueOf(y0.Ae), null, null, 6, null), null, 1, 2, null);
        if (z13) {
            textModel = new TextModel(new TextHolder(Integer.valueOf(y0.f70774ye), null, null, 6, null), null, 6, 2, null);
            str2 = str;
        } else {
            str2 = str;
            textModel = null;
        }
        TextModelCustom textModelCustom = new TextModelCustom(textModel3, str2, textModel);
        if (z14) {
            if (z11) {
                i12 = y0.Je;
            } else {
                i12 = y0.Le;
            }
            actionModel = new ActionModel(new TextHolder(Integer.valueOf(i12), null, null, 6, null), null, 2, null);
        } else {
            actionModel = null;
        }
        return new AlertModel(z12, dialogType, imageModel, textModel2, null, textModelCustom, actionModel, null, 144, null);
    }

    public static final AlertModel b(Context context, boolean z11, PostAdDialogs dialogType) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(dialogType, "dialogType");
        return new AlertModel(z11, dialogType, new ImageModel(t9.q0.A0, null, 2, null), new TextModel(new TextHolder(Integer.valueOf(y0.M4), null, null, 6, null), null, 0, 6, null), null, new TextModelCustom(new TextModel(new TextHolder(Integer.valueOf(y0.O4), null, null, 6, null), null, 0, 6, null), null, null), new ActionModel(new TextHolder(Integer.valueOf(y0.Z4), null, null, 6, null), null, 2, null), null, 144, null);
    }
}
