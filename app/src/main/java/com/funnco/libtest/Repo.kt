package com.funnco.libtest

import android.content.Context
import android.graphics.BitmapFactory
import android.widget.Toast
import com.funnco.images.model.ImagePreview
import com.funnco.toaster.Toaster

class Repo {
    companion object {
        fun getExamples(context: Context): List<ImagePreview> {
            val listOfImagePreview = mutableListOf<ImagePreview>()

            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter1), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter2), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter3), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter4), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter5), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter6), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter7), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter8), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter9), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter10), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter11), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter12), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter13), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter14), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter15), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.scooter16), "txt"
                ){ pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )
            listOfImagePreview.add(
                ImagePreview(
                    BitmapFactory.decodeResource(context.resources, R.drawable.ski1), "txt"
                ) { pos, binding ->
                    Toaster.show(pos.toString(), context)
                }
            )

            return listOfImagePreview
        }
    }
}